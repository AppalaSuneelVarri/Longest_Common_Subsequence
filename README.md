# Longest_Common_Subsequence

Problem Statement:

Develop a Java program to find the Longest Common Subsequence (LCS) of two input strings using dynamic programming. Additionally, extend the program to find the Longest Common Increasing Subsequence (LCIS) of the two input strings.

Objective:

Implement two dynamic programming algorithms, LCS_DP_1 and LCS_DP_2, to compute the LCS and LCIS of two given strings.
The program should read the input strings from a text file specified as a command-line argument.
Output the lengths of the LCS and LCIS, along with the actual sequences found.
Analyze the time complexity of both algorithms and compare their performance.
Functionality:

The program should read two input strings from a specified text file.
It should calculate and display the lengths of the LCS and LCIS, along with the corresponding sequences.
The LCS represents the longest sequence of characters that appear in the same order in both input strings.
The LCIS represents the longest sequence of characters that appear in increasing order in both input strings.
The program should utilize dynamic programming techniques to optimize the time complexity of both algorithms.
Constraints:

The input strings contain only lowercase English alphabets.
The length of each input string does not exceed 1000 characters.
The program should handle cases where no common subsequence or increasing subsequence exists between the input strings.
Input Format:

The input strings are provided in a text file, with each string on a separate line.
Output Format:

Display the lengths of the LCS and LCIS.
Output the actual sequences of the LCS and LCIS.
