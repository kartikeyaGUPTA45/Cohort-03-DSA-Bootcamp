Problem Statement: 
NavGurukul's website has a specific response mechanism based on the HTTP status code received:
If the response code is 404, the website will return NOT FOUND.
For any other response code different from 404, the website will return FOUND.
Given the response code as X, determine the website response.

Input Format
The first and only line of input contains a response code X.

Output Format
Output on a new line NOT FOUND, if the response code is 404. Otherwise print FOUND.

Solution:
public static String notFound(int num) {
    if (num == 404) return "NOT FOUND";
    else return "FOUND";
}
