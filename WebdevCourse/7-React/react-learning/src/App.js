import React, { useState } from "react";
import "./App.css";
import Person from './Person/Person';

const App = props => {  
    const [ personsState, setPersonsState] = useState({
      persons: [
        { name: 'Max', age: 28},
        { name: 'Manu', age: 29},
        { name: 'Stephanie', age: 26}
      ]
      
    });

    const [otherState, setOtherState] = useState('some other value');
    console.log(personsState, otherState);

    const switchNameHandler = (newName) => {
        // console.log('was clicked!');
        // DONT DO THIS: personsState.persons[0].name = 'maximillian';
        setPersonsState({
            persons: [
                { name: newName, age: 28 },
                { name: "Manu", age: 29 },
                { name: "Stephanie", age: 22 }
            ]
        })
    };

    const nameChangedHandler = (event) => {
      setPersonsState({
          persons: [
              { name: "Max", age: 28 },
              { name: event.target.value, age: 29 },
              { name: "Stephanie", age: 26 },
          ]
      });
    }
    const style = {
      backgroundColor: 'white',
      font: 'inherit',
      border: '2px solid blue',
      padding: '8px',
      cursor: 'pointer'
    };

        return (
            <div className="App">
                <h1>Hi I'm a React app</h1>
                <p>This is really working!</p>
                <button style={style} onClick={() => switchNameHandler('Maximillian')}>
                    Switch Name
                </button>
                <Person
                    name={personsState.persons[0].name}
                    age={personsState.persons[0].age}
                />
                <Person
                    name={personsState.persons[1].name}
                    age={personsState.persons[1].age}
                    // better use the bind syntax because the other passing method is inefficient.
                    click={switchNameHandler.bind(this, "Alice")}
                    changed={nameChangedHandler}
                >
                    My hobbys: Voetbal
                </Person>
                <Person
                    name={personsState.persons[2].name}
                    age={personsState.persons[2].age}
                />
            </div>
        );
        // return React.createElement("div", {className: 'App'}, React.createElement("h1", null, "Im a react App!!"));
    }


export default App;



   
