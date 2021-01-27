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

    const switchNameHandler = () => {
        // console.log('was clicked!');
        // DONT DO THIS: personsState.persons[0].name = 'maximillian';
        setPersonsState({
            persons: [
                { name: "Maximalling", age: 28 },
                { name: "Manu", age: 29 },
                { name: "Stephanie", age: 22 },
            ]
        });
    };

        return (
            <div className="App">
                <h1>Hi I'm a React app</h1>
                <p>This is really working!</p>
                <button onClick={switchNameHandler}>Switch Name</button>
                <Person
                    name={personsState.persons[0].name}
                    age={personsState.persons[0].age}
                />
                <Person
                    name={personsState.persons[1].name}
                    age={personsState.persons[1].age}
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



   
