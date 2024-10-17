package com.rafael.tennis;

public class TennisGame2 implements TennisGame
{
    private int p1Point = 0;
    private int p2Point = 0;

    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String[] points = { "Love", "Fifteen", "Thirty", "Forty" };
        String score = "";
        String p1Res = "";
        String p2Res = "";

        if (p1Point == p2Point) {  //Cas Egalité
            if (p1Point < 3) {
                score = points[p1Point] + "-All";   //Points + Partout
            } else {
                score = "Deuce";  //40 partout
            }
        }
        else if (p1Point >= 4 && p1Point - p2Point >= 2) {   //Cas Victoire J1
            score = "Win for player1";     //Victoire pour J1
        }
        else if (p2Point >= 4 && p2Point - p1Point >= 2) {   //Cas Victoire J2
            score = "Win for player2";     //Victoire pour J2
        }
        else {
             if (p1Point < 4){
                 p1Res = points[p1Point];
             }
             else {
                 p1Res = "Advantage player1";
             }
             if (p2Point < 4){
                 p2Res = points[p2Point];
             }
             else {
                 p2Res = "Advantage player2";
             }
            score = p1Res + "-" + p2Res;
        }

        return score;
    }
    
    public void setP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            scoreP1();
        }
            
    }
    
    public void setP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            scoreP2();
        }
            
    }
    
    public void scoreP1(){
        p1Point++;
    }
    
    public void scoreP2(){
        p2Point++;
    }

    public void wonPoint(String player) {
        if (player != null && player.equals("player1"))
            scoreP1();
        else
            scoreP2();
    }
}