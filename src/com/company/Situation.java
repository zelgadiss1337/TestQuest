package com.company;

public class Situation {
    Situation[] direction;
    String subject,text;
    int dFD, dTILT;
    public Situation (String subject, String text, int variants, int dfd, int dtilt) {
        this.subject=subject;
        this.text=text;
        dFD=dfd;
        dTILT=dtilt;
        direction=new Situation[variants];
    }
}