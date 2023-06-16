/*
 * Question 2: Elections
Problem Description

Elections are going on, and there are two candidates A and B, contesting with each other. There is a queue of voters and in this queue some of them are supporters of A and some of them are supporters of B. Many of them are neutral. The fate of the election will be decided on which side the neutral voters vote. Supporters of A and supporters of B make attempt to win the votes of neutral voters.

The way this can be done is explained below:

1. The voter queue is denoted by three characters, viz {-, A, B}. The – denotes neutral candidate, A denotes supporter of candidate A and B denotes supporter of candidate B.

2. Supporters of A can only move towards the left side of the queue.

3. Supporters of B can only move towards the right side of the queue.

4. Since time is critical, supporters of both A and B will move simultaneously.

5. They both will try and influence the neutral voters by moving in their direction in the queue. If supporter of A reaches the neutral voter before supporter of B reaches him, then that neutral voter will become a supporter of candidate A.

6. Similarly, if supporter of B reaches the neutral voter before supporter of A reaches him, then that neutral voter will become a supporter of candidate B.

7. Finally, if both reach at the same time, the voter will remain neutral. A neutral vote cannot decide the outcome of the election.

8. If finally, the queue has more votes for candidate A, then A wins the election. If B has more votes, then B wins that election. If both have equal votes, then it will be a coalition government.

Refer Examples section for understanding the dynamics of how the supporters influence the neutral voters.

Your task is to find the outcome of the election.

Note: There are no test cases where all votes are neutral.

Input

First line contains an integer which is length of queue of voters.

Second line contains characters {-, A, B}, in which denotes

· A = voter who is supporter of candidate A

· B = voter who is supporter of candidate B

· – = neutral voter

Output

Print candidate with maximum number of votes. If they have equal number of votes, print “Coalition government“.

Examples

Input :14

–AB–AB—A–

Output : A

Input : 4

A—

Output : A
 * */

package com.codevita;

import java.util.Scanner;

public class Elections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String queue=sc.nextLine();
		String outcome=electionOutcome(queue);
		System.out.println(outcome);
	}
	public static String electionOutcome(String queue) {
		int voteA=0;
		int voteB=0;
		int neutralIndex=queue.indexOf('-');
		int left=neutralIndex-1;
		int right=neutralIndex+1;
		while(left>=0 && right<queue.length()) {
			if(queue.charAt(left)=='A')
				voteA++;
			else if(queue.charAt(left)=='B')
				voteB++;
			if(queue.charAt(right)=='A')
				voteA++;
			else if(queue.charAt(right)=='B')
				voteB++;
			left--;
			right++;
		}
		for(int i=left;i>=0;i--) {
			if(queue.charAt(i)=='A')
				voteA++;
			else if(queue.charAt(i)=='B')
				voteB++;
		}
		for(int i=right;i<queue.length();i++) {
			if(queue.charAt(i)=='A')
				voteA++;
			else if(queue.charAt(i)=='B')
				voteB++;
		}
		if(voteA>voteB)
			return "A";
		else if(voteB>voteA)
			return "B";
		else
			return "Coalition Government";
	}
}
