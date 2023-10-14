import Header from './components/Header'
import Spending from './components/Spending';


const App = () => {
  return (
    <div className="container-fluid text-center w-75" style={{ border: '1px solid red' }}>
      <Header title="Budget Tracker"/>
      <Spending />
    </div>
  );
}

export default App;
