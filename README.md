# Mars Rover

*Thoughtworks challenge in Graduate Program Recruitment*

## Problem

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.
 
A rover’s position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
 
In order to control a rover, NASA sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the rover spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward one grid point, and maintain the same heading.
 
Assume that the square directly North from (x, y) is (x, y+1).
 
**Input**:
- The first line of input is the upper-right coordinates of the plateau, the lowerleft coordinates are assumed to be 0,0.
- The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover’s position, and the second line is a series of instructions telling the rover how to explore the plateau.
- The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover’s orientation.
- Each rover will be finished sequentially, which means that the second rover won’t start to move until the first one has finished moving.

**Output**:
- The output for each rover should be its final co-ordinates and heading.

**Input and Output**
 
*Test Input*:
`5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM`
 
*Expected Output*:
`1 3 N
5 1 E`

## Rules

1. Do not not use any external libraries to solve this problem, but you may use external libraries or tools for building or testing purposes. Specifically, you may and are encouraged to use unit-testing libraries and build tools available for your chosen language (e.g., JUnit, Ant, NUnit, Rspec, Rake, etc.)
2. System security is very important to us and certain file extensions will be blocked for security purposes, resulting in delays to your application. You should NOT include any executable attachments, including those with .exe or .lib extensions. Please submit your code as a zipped file of source code and supporting files, without any compiled code. If you're submitting in C#, please do not submit your code as a .msi file
3. Please include a brief explanation of your design and assumptions, along with your code, as well as detailed instructions to run your application
4. When submitting your code, please label it in the following manner: ExerciseLanguageYourInitials for example TrainsJavaMS
5. To assist us carrying out an unbiased review, please do not include your full name in the source code or Readme file
6. We want our hiring process to be fair, and for everyone to start from the same place. To enable this, we request that you do not share or publish these problems, or your solution
7. We assess a number of things including the design aspect of your solution and your object oriented or functional programming skills. While these are small problems, we expect you to submit what you believe is production-quality code; code that you’d be able to run, maintain, and evolve. You don’t need to gold plate your solution. We ask that you strive for simplicity, instead of an over–sophisticated solution
8. Please compress your files into a single .zip file before upload. Kindly ensure there are no executables in your submission. Our system blocks executable files* for security purposes, and we want to avoid any delays in your process
9. Executables include asp, bat, class, cmd, com, cpl, dll, exe, fon, hta, ini, ins, iw, jar, jsp, js, jse, pif, scr, shs, sh, vb, vbe, vbs, ws, wsc, wsf, wsh & msi

## Notes

- For the solution, we request that you use Java, Ruby, C#, Python, Clojure, Scala or JavaScript.
- There must be a way to supply the application with the input data via text file
- We need to be able to build and run your code ourselves
- You should provide sufficient evidence that your solution is complete by indicating that it works correctly against the supplied test data
- Please use the URL at the bottom of this email to submit your code.
- We encourage candidates to include the code revision history (e.g. .git folder or .hg folder) in their submission to show their commits

Copyright 2012 ThoughtWorks, Inc
