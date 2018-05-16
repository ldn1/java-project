package ru.ldn;

public class Main {
    public static void main(String[] args) {

        String[] words = new String[3];
        words[0] = "Гарри";
        words[1] = "Гермиона";
        words[2] = "Рон";
        String[] resources = new String[3];
        resources[0] = "http://fanfics.me/fic116381";
        resources[1] = "ftp://127.0.0.1/volhinskamorda__Road_Untravelled_116381.html";
        String res = "/home/asmi/result.txt";

        GetOccurencies occurenciesHandler = new OccurenciesHandler();
        try {
            occurenciesHandler.getOccurencies(resources, words, res);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
