const url = 'http://localhost:8080/api/items';

// Data to send in the POST request
const newItem = {
  name: 'New Item', // Change this to the name of the new item
};

// Configuration for the POST request
const requestOptions = {
  method: 'POST', // HTTP POST method
  headers: {
    'Content-Type': 'application/json', // Set the content type to JSON
  },
  body: JSON.stringify(newItem), // Convert the data to JSON format
};

// Make the POST request
fetch(url, requestOptions)
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })
  .then(data => {
    console.log('New item added:', data);

    // After the POST request, make the GET request to retrieve data
    return fetch(url);
  })
  .then(response => response.json())
  .then(data => {
    console.log('Items:', data);
  })
  .catch(error => {
    console.error('Error:', error);
  });
