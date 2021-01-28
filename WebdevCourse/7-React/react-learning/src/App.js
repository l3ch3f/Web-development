import React, { Component } from "react";
import classes from "./App.css";
import Person from "./Person/Person";
// import styled from "styled-components";
// import Radium, { StyleRoot } from "radium";

/* styled-components package */
// const StyledButton = styled.button`
//     background-color: ${props => props.alt ? 'red' : 'green'};
//     color: white;
//     font: inherit;
//     border: 1px solid blue;
//     padding: 8px;
//     cursor: pointer;
//     &:hover {
//         background-color: ${props => props.alt ? 'yellow' : 'lightgreen'};
//         color: black;
//     },
// `;

class App extends Component {
    state = {
        persons: [
            { id: "1", name: "Max", age: 28 },
            { id: "2", name: "Manu", age: 29 },
            { id: "3", name: "Stephanie", age: 26 },
        ],
        otherState: "some other value",
        showPersons: false,
    };

    // switchNameHandler = (newName) => {
    //     // console.log('Was clicked!');
    //     // DON'T DO THIS: this.state.persons[0].name = 'Maximilian';
    //     this.setState({
    //         persons: [
    //             { name: newName, age: 28 },
    //             { name: "Manu", age: 29 },
    //             { name: "Stephanie", age: 27 },
    //         ],
    //     });
    // };

    nameChangedHandler = (event, id) => {
        const personIndex = this.state.persons.findIndex((p) => {
            return p.id === id;
        });

        const person = {
            ...this.state.persons[personIndex],
        };

        person.name = event.target.value;
        const persons = [...this.state.persons];
        persons[personIndex] = person;
        this.setState({ persons: persons });
    };

    deletePersonHandler = (personIndex) => {
        // const persons = this.state.persons.slice();
        const persons = [...this.state.persons];
        persons.splice(personIndex, 1);
        this.setState({ persons: persons });
    };

    togglePersonsHandler = () => {
        const doesShow = this.state.showPersons;
        this.setState({ showPersons: !doesShow });
    };

    render() {
        // const style = {
        //     backgroundColor: "green",
        //     color: "white",
        //     font: "inherit",
        //     border: "1px solid blue",
        //     padding: "8px",
        //     cursor: "pointer",
        //     ":hover": {
        //         backgroundColor: "lightgreen",
        //         color: "black",
        //     },
        // };

        let persons = null;

        if (this.state.showPersons) {
            persons = (
                <div>
                    {/* DYNAMIC LIST RENDERING : top
                      HARDCODED LIST BOTTOM
                  */}
                    {/**/}
                    {this.state.persons.map((person, index) => {
                        return (
                            <Person
                                click={() => this.deletePersonHandler(index)}
                                name={person.name}
                                age={person.age}
                                key={person.id}
                                changed={(event) =>
                                    this.nameChangedHandler(event, person.id)
                                }
                            />
                        );
                    })}
                    {/*/}
                    <Person
                        name={this.state.persons[0].name}
                        age={this.state.persons[0].age}
                    />
                    <Person
                        name={this.state.persons[1].name}
                        age={this.state.persons[1].age}
                        click={this.switchNameHandler.bind(this, "Max!")}
                        changed={this.nameChangedHandler}
                    >
                        My Hobbies: Racing
                    </Person>
                    <Person
                        name={this.state.persons[2].name}
                        age={this.state.persons[2].age}
                    />
                    {/**/}
                </div>
            );

            // style.backgroundColor = "red";
            // style[":hover"] = {
            //     backgroundColor: "yellow",
            //     color: "grey",
            // };
        }

        const assignedClasses = [];
        if (this.state.persons.length <= 2) {
            assignedClasses.push(classes.red); // classes = ['red']
        }
        if (this.state.persons.length <= 1) {
            assignedClasses.push(classes.bold); // classes = ['red', 'bold']
        }
        return (
            // <StyleRoot>
            <div className={classes.App}>
                <h1>Hi, I'm a React App</h1>
                <p className={assignedClasses.join(" ")}>
                    This is really working!
                </p>
                {/* <StyledButton alt={this.state.showPersons} onClick={this.togglePersonsHandler}> */}
                <button
                    className={classes.Button}
                    onClick={this.togglePersonsHandler}
                >
                    Toggle Persons
                    {/* </StyledButton> */}
                </button>
                {persons}
            </div>
            // </StyleRoot>
        );
        // return React.createElement('div', {className: 'App'}, React.createElement('h1', null, 'Does this work now?'));
    }
}

// export default Radium(App);
export default App;
