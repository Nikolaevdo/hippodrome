Related project: testing and logging
====================================

This program is an imitation of a hippodrome
--------------------------------------------

To begin with, as in the previous project, fork yourself from the repository: [https://github.com/pavlo-plynko/hippodrome](https://github.com/pavlo-plynko/hippodrome) , and clone this fork yourself.

**Your task is to add testing and logging.**

List of required tests
----------------------

In the following list, each item must be implemented as a separate test method. When coming up with names for test methods, try to be concise, but at the same time, so that you can roughly understand what exactly is being tested in them. For example, compare these two test results:

![](data:image/webp;base64,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)

In the second case, it is more difficult to understand which tests did not pass, and you will have to look at the logs.

### 1\. Horse class:

1.  **constructor**

* Check that when passed to the constructor as the first parameter `null`, will be thrown `IllegalArgumentException`. To do this, use the method `assertThrows`;
* Check that when passed to the constructor as the first parameter `null`, the thrown exception will contain the message "Name cannot be null.". To do this, you need to get a message from the caught exception and use the `assertEquals`;
* Check that when passing an empty string or a string containing only whitespace characters (space, tab, etc.) as the first parameter to the constructor, . will be thrown `IllegalArgumentException`. To test with different variants of whitespace characters, you need to make the test parameterized;
* Check that when passing an empty string or a string containing only whitespace characters (space, tab, etc.) to the constructor as the first parameter, the thrown exception will contain the message "Name cannot be blank.";
* Check that when passing a negative number as the second parameter to the constructor, ; will be thrown `IllegalArgumentException`;
* Check that when a negative number is passed to the constructor as the second parameter, the thrown exception will contain the message "Speed cannot be negative.";
* Check that when passing a negative number as the third parameter to the constructor, ; will be thrown `IllegalArgumentException`;
* Check that when passing a negative number to the constructor as the third parameter, the thrown exception will contain the message "Distance cannot be negative.";

3.  **getName method**

* Check that the method returns the string that was passed as the first parameter to the constructor;

5.  **getSpeed method**

* Check that the method returns the number that was passed as the second parameter to the constructor;

7.  **getDistance method**

* Check that the method returns the number that was passed as the third parameter to the constructor;
* Check that the method returns zero if the object was created using a constructor with two parameters;

9.  **move method**

* Check that the method calls inside the method `getRandomDouble`with parameters 0.2 and 0.9. To do this, you need to use `MockedStatic`its method `verify`;
* Check that the method assigns the distance value calculated by the formula: `distance + speed * getRandomDouble(0.2, 0.9)`. To do this, you need to lock `getRandomDouble`it so that it returns certain values that you need to set by parameterizing the test.

### 2\. Hippodrome class:

1.  **Constructor**

* Check that when passed to the constructor `null`, ; will be thrown `IllegalArgumentException`;
* Check that when passed to the constructor `null`, the exception thrown will contain the message "Horses cannot be null.";
* Check that when passing an empty list to the constructor, ; will be thrown `IllegalArgumentException`;
* Check that when passing an empty list to the constructor, the thrown exception will contain the message "Horses cannot be empty.";

3.  **getHorses method**

* Check that the method returns a list that contains the same objects and in the same sequence as the list that was passed to the constructor. **When creating the Hippodrome** object , pass a list of 30 different horses to the constructor;

5.  **move method**

* Check that the method calls the move method on all horses. When creating the Hippodrome object, pass a list of 50 mock horses to the constructor and use the `verify`.

7.  **getWinner method**

* Check that the method returns the horse with the largest distance value.

### 3\. Main class

1.  **main method**

* Check that the method is executed no longer than 22 seconds. To do this, use the Timeout annotation. After writing this test, disable it (use the Disabled annotation). So it will not take time to run all the tests, and if necessary, it can be run manually.

What needs to be logged
-----------------------

### 1\. Main class:

1.  After creating the hippodrome object, add an entry like this to the log:`2022-05-31 17:05:26,152 INFO Main: Start of the race. Number of participants: 7`
2.  After displaying information about the winners, add an entry like this to the log:`2022-05-31 17:05:46,963 INFO Main: Okonchaniye skachek. Pobeditelʹ: Vishnya
    35 / 5 000
    Translation results
    End of the race. Winner: Cherry`

### Hippodrome class:

1.  If null was passed to the constructor, then before throwing the exception, add an entry like this to the log:`2022-05-31 17:29:30,029 ERROR Hippodrome: Horses list is null`
2.  b. If an empty list was passed to the constructor, then before throwing the exception, add an entry like this to the log:`2022-05-31 17:30:41,074 ERROR Hippodrome: Horses list is empty`
3.  At the end of the constructor, add an entry like this to the log:`2022-05-31 17:05:26,152 DEBUG Hippodrome: Creation Hippodrome, horse [7]`

### 3\. Horse class:

1.  If null is passed to the constructor instead of a name, then before throwing the exception, add an entry to the log like:`2022-05-31 17:34:59,483 ERROR Horse: Name is null`
2.  If the name passed to the constructor is empty, then before throwing the exception, add an entry like this to the log:`2022-05-31 17:36:44,196 ERROR Horse: Name is blank`
3.  If the speed passed to the constructor is less than zero, then before throwing the exception, add an entry like this to the log:`2022-05-31 17:40:27,267 ERROR Horse: Speed is negative`
4.  If the distance passed to the constructor is less than zero, then before throwing the exception, add an entry like this to the log:`2022-05-31 17:41:21,938 ERROR Horse: Distance is negative`
5.  At the end of the constructor, add an entry like this to the log:`2022-05-31 17:15:25,842 DEBUG Horse: Creation Horse, name [Lobster], speed [2.8]`

Logs should be written to the **hippodrome.log** file , which should be located in the project root in the **logs** folder . Every day the file should be renamed according to the pattern **hippodrome.2021-12-31.log** and a new **hippodrome.log** should be created instead . To do this, use the RollingFile **appender** . In this case, files older than 7 days should be deleted. To do this, you can use a construct like:

`<DefaultRolloverStrategy>'

'<Delete …>'
'<IfFileName …/>'
'<IfLastModified …/>'

'</Delete>'
'</DefaultRolloverStrategy>'
