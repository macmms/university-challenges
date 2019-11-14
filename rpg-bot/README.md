# Figment of Fitecraft

In a world of MMORPGs, one stands above the rest as the most popular in the history of the internet.
Figment of Fitecraft.

So today we're going to work on a bot to interact with the figment.
Bots are the future of gaming, and we want to make sure ours can compete with the best of the best.
In this project, which is a work in progress, we're building the ability to mirror the game state and interact with it.
We'll build a way to interact with the bot some other time. For now we want to build out our service layer to hook into later.
This means we have to build based on the expectations for how the rest of the bot will work with our service layer.

To get started, our services are:

* Action Service
* Inventory Service
* Love Service
* Map Service
* Stat Service
* Trade Service

But today, we're focusing on the Love Service, because bots need love too.

The love service has, for now, five methods:

* flirtWith (provider, recipient, flirtyStatement) : Affection
* giveGiftTo (provider, recipient, gift) : Affection
* showPhysicalAffectionTo (provider, recipient, action) : Affection
* enterRelationshipWith (initiator target) : boolean
* breakUpWith (heartbreaker, heartbroken) : boolean

The requirements for each are the following:

## Flirt With

This method is to simulate when a player flirts with an NPC.
Upon a flirtation attempt, the resulting affection should be returned.
The requirements are as follows:

* If the player flirts with an NPC that doesn't have any existing affection, create a new affection
* If the player's statement is a flirt, increase the affection (not reflective of real life)
* If the player's statement is not a flirt, decrease the affection
* The affection cannot exceed the minimum or maximum values of affection
* A new affection begins at the starting affection amount (before being increased or decreased)
* Only NPCs can be flirted with

## Give Gift To

This method is to simulate when a player gives a gift to an NPC.
Upon a gift giving attempt, the resulting affection should be returned.
The requirements are as follows:

* The gift must be an item, consumable, or equipment
* The affection gained should be equivalent to the monetary value of the gift minus the level of the NPC
* The affection cannot exceed the minimum or maximum values of affection
* Only NPCs can be the recipient of gifts


## Show Physical Affection To

This method is to simulate when a player shows physical affection to an NPC.
Upon the attempt of showing physical affection, the resulting affection should be returned.
The requirements are as follows:

* The action must be a hug or cuddle
* A hug requires a minimum affection of halfway between the starting affection and the maximum affection (not reflective of real life)
* A cuddle requires a minimum affection of 85
* A cuddle requires being in a relationship with the NPC (not reflective of real life)
* Only NPCs can be shown physical affection
* Affection increases by the following formula:
  * 10 - the difference between the player's and the NPC's strength
* The affection cannot exceed the minimum or maximum values of affection

## Enter Relationship With

This method is to simulate when a player enters a relationship with an NPC.
Upon attempting to enter a relationship, the success or failure is returned.
The requirements are as follows:

* Entering a relationship requires a minimum affection amount of 90
* Entering a relationship requires not being in a relationship with the target NPC
* A relationship can only be entered with an NPC

## Break Up With

This method is to simulate when a player ends a relationship with an NPC.
Upon attempting to end a relationship, the success or failure is returned.
The requirements are as follows:

* Ending a relationship requires being in a relationship with the NPC
* Ending a relationship reduces the affection the NPC has toward the player by 30
* A relationship can only be ended with an NPC
* The affection cannot go below the minimum value of affection

# Scoring

This is a competition, which means that there needs to be a way to judge the competition.
For this, we're using a scoring sheet.
Testing requirements are worth points, implementing the methods themselves are worth points, and completing an entire (test to implementation) is worth bonus points.

It is your job as a competitor to fill out the scoring sheet yourself.
The rules fo the scoring sheet are as follows:

* Every box left unchecked will not be reviewed
* Every checked box that has a correct answer (a proper test/implementation) will be awarded the points it's worth
* Every checked box that has an incorrect answer or no answer will have the points it's worth subtracted

The subtraction of points for incorrect solutions is to dissuade cheating.

Be sure to fill out the score sheet and commit it to your repository for when it is judged.
The score sheet and code reviewed will the the last commit before the time limit on the master branch of the repository.

### Flirt With

Already implemented.

### Give Gift To

[ ] REQUIREMENT (3pt): The gift must be an item, consumable, or equipment  
[ ] REQUIREMENT (3pt): The affection gained should be equivalent to the monetary value of the gift minus the level of the NPC  
[ ] REQUIREMENT (3pt): Only NPCs can be the recipient of gifts  
[ ] REQUIREMENT (3pt): The affection cannot exceed the minimum or maximum values of affection  
[ ] IMPLEMENTATION (4pt): Fully implemented method  
Points for full completion: bonus 4 points.

### Show Physical Affection To

[ ] REQUIREMENT (3pt): The action must be a hug or cuddle  
[ ] REQUIREMENT (3pt): A hug requires a minimum affection of halfway between the starting affection and the maximum affection (not reflective of real life)  
[ ] REQUIREMENT (3pt): A cuddle requires a minimum affection of 85  
[ ] REQUIREMENT (3pt): A cuddle requires being in a relationship with the NPC (not reflective of real life)  
[ ] REQUIREMENT (3pt): Only NPCs can be shown physical affection  
[ ] REQUIREMENT (3pt): Affection increases by the listed formula  
[ ] REQUIREMENT (3pt): The affection cannot exceed the minimum or maximum values of affection  
[ ] IMPLEMENTATION (5pt): Fully implemented method  
Points for full completion: bonus 7 points.

### Enter Relationship With

[ ] REQUIREMENT (3pt): Entering a relationship requires a minimum affection amount of 90  
[ ] REQUIREMENT (3pt): Entering a relationship requires not being in a relationship with the target NPC  
[ ] REQUIREMENT (3pt): A relationship can only be entered with an NPC  
[ ] IMPLEMENTATION (4pt): Fully implemented method  
Points for full completion: bonus 4 points.

### Break Up With

[ ] REQUIREMENT (3pt): Ending a relationship requires being in a relationship with the NPC  
[ ] REQUIREMENT (3pt): Ending a relationship reduces the affection the NPC has toward the player by 30  
[ ] REQUIREMENT (3pt): A relationship can only be ended with an NPC  
[ ] REQUIREMENT (3pt): The affection cannot go below the minimum value of affection  
[ ] IMPLEMENTATION (4pt): Fully implemented method  
Points for full completion: bonus 4 points.
