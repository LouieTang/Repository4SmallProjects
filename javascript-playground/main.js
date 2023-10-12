import { LivingThing } from "./livingclass.js";

class Animal extends LivingThing{
    constructor(species, isBreathing){
        super(isBreathing);
        this.species = species;
    }
    
    animalType(){
        return `${this.species}`;
    }
}

class Cheetah extends Animal{
    constructor(name){
        super("cheetah", true)
        this.name = name;
    }

    animalType(){
        return `${this.name} : ${this.species}`;
    }
}

let cheetah = new Cheetah("chester");

console.log(cheetah.animalType());
console.log(cheetah);
console.log(cheetah.isBreathing)

class Zoo{
    constructor(location, name){
        this.name = name;
        this.location = location;
        this.animals = [];
    }

    setAnimal(animal){
        this.animals.push(animal);
        console.log(`success, ${animal.name} is in the zoo!`);
    }
    getAnimal(animal){
        return this.animals.includes(animal) ? `${animal.name} is in the zoo` : `${animal} is not in the zoo`;
    }
}


const vancouverZoo = new Zoo("Vancouver", "Vancouver Zoo");
vancouverZoo.setAnimal(cheetah);
console.log(vancouverZoo);