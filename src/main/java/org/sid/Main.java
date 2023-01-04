package org.sid;

import proxy.ReleveWS;
import proxy.ReleveWSService;

public class Main {
    public static void main(String[] args) {
        ReleveWS stub = new ReleveWSService().getReleveWSPort();
        System.out.println( stub.consulter(2152).getSolde());
        System.out.println( stub.consulter(2152).getDateReleve());


    }
}