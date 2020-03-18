# risk
Risk game implementation. Kind of...

Risk is a board game representing a world map broken up into hypothetical countries, in which several opposing players attempt to conquer the world. During a player's turn, armies stationed in one country are only allowed to attack countries with which they share a common border. During the course of play, a player often engages in a sequence of conquests with the goal of transferring his armies from some starting country to a destination country. One chooses the intervening countries so as to minimize the total number of countries that need to be conquered. Given descriptions of game boards with 20 countries each with between 1 and 19 connections to other countries, your task is to develop solutions taking a starting country and a destination country which compute the minimum number of countries that must be conquered to reach the destination. You need to output just the number of countries to be conquered including the destination.

Fig 1 - See orange agenda

Input. The above connection diagram illustrates the first sample input. Input will consist of a series of country configuration test sets. Each test set will consist of a board description on lines 1..19.
Each set avoids listing every national boundary twice by only listing the fact that country ***I*** borders country ***J*** when ***I < J***. Thus, the ***Ith*** line, where I<=20, contains an integer K indicating how many "higher-numbered" countries share borders with country I, then K distinct integers where J > I and J<=20, each describing a boundary between countries I and J. Line 20 of the test set contains a single integer N (1 <= N <= 100), the number of country pairs that follow. The next N lines each contain two integers (1 <= A B <= 20, A != B) indicating the starting and ending countries for a possible conquest. There can be multiple test sets in the input file. There will be at least one path between any two given countries in every country configuration. 

Output. For each input set, your program should print the following message "Test Set #T", where T is the number of the test set starting with #1. The next Nt lines each will contain the minimum number of countries to conquer for the corresponding test in the test set. The test result line should contain the start country code A; then the string " to "; the destination country code B the string ": "; and a single integer - the minimum number of moves required to traverse from A to B in the test set. 