# Programming Task: FikaBuddy

### Deadline
This task should be completed and submitted before the end of the current exercise session.

### Instructions
For details on how to complete and submit your assignment, refer to the [course instructions](https://example-university.edu/course/cs101/assignments).

### Preparation

- Complete Module 2: Exploring Java Classes.
- Access the learning material: 
  - Via the course Canvas page, link to Java Programming section
  - Or directly at [Java Programming Course](https://example-university.edu/course/cs101/resources).

### Learning Goals

This week, you'll learn about:
* Creating and designing Java classes
* Implementing instance fields
* Writing a constructor method
* Developing getters and setters
* Employing the dot operator
* Outputting information to the terminal
* Understanding of the `main` method
* Recognizing scope and variable shadowing

### Troubleshooting Guide

1. Review this week's [discussion topics](https://example-university.edu/course/cs101/help/discussions).
2. If your question hasn't been addressed, post it by creating a [New Discussion](https://example-university.edu/course/cs101/help/new-discussion).
3. Also, consider dropping by the [weekly help session](https://example-university.edu/course/cs101/help/session-hours).

### Assignment

Your task is to create a Java program that models a Fika meeting in Sweden. In Swedish culture, "Fika" is a concept, often considered essential, which involves taking a break for coffee and a bite to eat with colleagues, friends, or family.

#### 1. Getting Started

Start by creating a new Java file named `Fika.java` in your project's `src` folder. This file will house your `Fika` class.

Start designing your Fika class with attributes that you think are essential for a Fika meeting. Here are some suggestions to get you started:

- `String` location
- `String` time
- `boolean` isCoffeeAvailable
- `boolean` isSnackAvailable
- `int` numberOfParticipants

#### 2. The Fika Participants

Next, let's enhance our Fika experience by allowing for multiple participants. Create a `Participant` class with personal attributes such as name and favorite Fika snack.

Remember, it becomes clunky to manage multiple participants manually if you were to keep data about each participant directly in your Fika class. Can you think of a better way to manage them within your `Fika` class?

#### 3. Using Constructors

We want to make setting up a Fika session as easy as possible. Thus, implement a constructor in your Fika class that takes arguments for the location, time, whether coffee and snacks are available, and the initial number of participants.

#### 4. Managing Participants

Implement methods within your Fika class for adding and removing participants. This would typically involve manipulating a list of `Participant` objects. Consider what happens if a participant decides to leave the Fika early.

#### 5. Information Display

Develop a method within your Fika class to display all relevant information about the Fika session, including the details about each participant. Use this to quickly get an overview of the upcoming Fika.

#### 6. The Invitation Feature

Implement a feature that allows sending out invitations for the Fika. Each participant should receive a personalized invite with the Fika details. Think about how you would simulate sending an invitation.

#### 7. Overloading and Encapsulation

Try overloading the constructor of the Fika class to provide default values for a Fika session. Also, ensure all instance fields in your classes are kept private and accessed through getters and setters.

#### 8. Wrapping It All Together

Create a `Main` class with a `main` method where you set up a new Fika session, add several participants, display the Fika information, and send out invitations.

#### Bonus: Fika Conversations

For an extra challenge, introduce a method in your Fika class that simulates a conversation among participants. Each participant could have a list of phrases they might say.

### Checklist

- Fika and Participant classes with appropriate attributes
- Constructor methods for easy setup
- Methods to manage Fika participants
- Information display method
- Invitation feature
- Properly encapsulated fields and use of overload constructors
- A Main class demonstrating the creation and management of a Fika session

### Additional Notes

If you encounter issues or inconsistencies with the task, reach out by creating a [New Discussion](https://example-university.edu/course/cs101/help/new-discussion) on the course page. Remember, sharing exact code answers is not allowed, but discussing concepts and approaches is encouraged.
