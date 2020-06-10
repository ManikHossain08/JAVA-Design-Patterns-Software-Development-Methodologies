# Designing and Implementing (Some of) Dungeon and Dragons Character Classes using JAVA design Patterns

# Problem Statement

Wikipedia reports that “Dungeons & Dragons (commonly abbreviated as D&D or DnD) is a fantasy tabletop role-playing game (RPG) originally designed by Gary Gygax and Dave Arneson. It was first published in 1974 by Tactical Studies Rules, Inc. (TSR). The game has been published by Wizards of the Coast (now a subsidiary of Hasbro) since 1997. It was derived from miniature wargames, with a variation of the 1971 game Chainmail serving as the initial rule system. D&D's publication is commonly recognized as the beginning of modern role-playing games and the role-playing game industry. 

D&D departs from traditional wargaming by allowing each player to create their own character to play instead of a military formation. These characters embark upon imaginary adventures within a fantasy setting. A Dungeon Master (DM) serves as the game's referee and storyteller, while maintaining the setting in which the adventures occur, and playing the role of the inhabitants of the game world. The characters form a party and they interact with the setting's inhabitants and each other. Together they solve dilemmas, engage in battles, and gather treasure and knowledge. In the process, the characters earn experience points (XP) in order to rise in levels, and become increasingly powerful over a series of separate gaming sessions.” (Emphasis mine.)

We want to create character generator: a tool with which a player can create xyr own character, from a set of given character classes (e.g., the Ranger), a set of abilities, and pieces of equipment. Instead of using numerical values to characterise the character’ abilities, the system will offer explicit, first-class abilities (e.g., “intuition” or “leadership”). The system will also offer to equip characters with different internal and external pieces of equipment or capabilities (e.g., armours, weapons, bags… but also “stealth” or “shapeshifting”).
 
# Rules

Explanations and Justifications Matter!
In every justification, report the (abstract) design problem to solve, discuss possible alternative solutions, and explain the trade-offs of each solutions before choosing one solution.
Favour short explanations. Be careful of grammar and vocabulary. In particular, use the proper terms as seen during the course. If necessary, draw short but illustrative class and sequence diagrams. (You can draw these diagrams by hand if it is faster than by computer).

# Design and Code Quality Matter!
Use the Maven project given to you as basis for your code.
Use Java 7. Do not worry about generics or the latest features of the Java language.
Make sure to choose the most appropriate design.
Make sure to write simple and clean code.
Make sure that your code compiles and runs.
Modify the Client class to illustrate via one or more examples your design/implementation.
Package types (interfaces) and classes appropriately.
Make types, classes, methods, and fields visible appropriately.
Name packages, classes, types, methods, fields, parameters, and local variable appropriately.
 
# Question 1: 
The given code provides examples of character classes (e.g., Ranger). Innate abilities are numerous, but we will consider the following ones:
- Strength: burly, fit, scrawny, plump
- Dexterity: slim, sneaky, awkward, clumsy
- Constitution: strong, healthy, frail, sick
-	Intelligence: inquisitive, studious, simple, forgetful
-	Wisdom: good judgement, empathy, foolish, oblivious
-	Charisma: leadership, confidence, timid, awkward

Redesign the given code to allow adding abilities to the characters so that new “values” for innate abilities could be added later without having to modify (much) the implementation of the character classes (e.g., a new Constitution: invincible). Before implementing your design, justify your choice in the space below (no more). Then, implement your design based on the given code.

 
# Question 2: 
Characters can wear various types of clothing: boots, hats, helmets, cloaks, armour. Redesign the given code to allow adding types of clothing to the characters in such a way that new types can be added and worn by characters without having to modify (much) the implementation of the character classes. Before implementing your design, justify your choice in the space below (no more) and explain how you enforce that certain types of clothing must be worn before or after other certain types, e.g., how do you enforce that armours must always be on top of clothes? Then, implement your design based on the given code. 

# Question 3: 
Characters can carry various items in satchels or boxes: food items, books, gold coins, rings. Satchels are useful for food items, books, etc. while boxes protect gold coins, magical rings, etc. Separate for the given code, design and implement a hierarchy that offer satchels and boxes in which various items can be stored. Before implementing your design, justify your choice in the space below (no more) and explain how you enforce that certain items can only be put in satchels, e.g., food items, and not boxes (because boxes are too small). Then, implement your design independently of the given code. 


# Question 4: 
Redesign the given code to allow characters to carry satchels and boxes (themselves possibly containing various items) and to allow characters to possess powers, e.g., spells, infravision, summons, etc. Before implementing your design, justify your choice in the space below (no more) and explain how you distinguish items (e.g., satchels) from powers (e.g., infravision). Then, implement your design based on the given code.


 
# Question 5: 
Characters can wear different types of clothing, carry items, and possess powers, which all combine with their innate abilities. These combinations result in the final values for a character’s abilities. For example, a character’s final strength could be the sum of the character’s innate strength (Question 1) plus the strength added from wearing (or not) armour, helmets, etc. (Question 2) plus the strength added from carrying special items and having powers (Questions 3 and 4). Combine and redesign the given code and your previous code to allow computing a character’s final abilities, e.g., strength, without having to modify your design every time the rules of the game change. Before implementing your design, justify your choice in the space below (no more). Then, implement your design based on the given code. 
