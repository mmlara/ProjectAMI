package is.ecci.ucr.projectami.SamplingPoints;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

import is.ecci.ucr.projectami.BDAdministrator;
import is.ecci.ucr.projectami.Bugs.Bug;
import is.ecci.ucr.projectami.DBConnectors.DBAdmin;

/**
 * Created by Daniel on 5/10/2017.
 */

public class SamplingPoint {
    private double score;
    private int lowQualBug;
    private int medQualBug;
    private int hghQualBug;
    private LinkedList<Bug> bugList;
    private Site site;

    public SamplingPoint(Site site) {
        score = 0;
        lowQualBug = 0;
        medQualBug = 0;
        hghQualBug = 0;
        bugList = new LinkedList<>();
        this.site = site;
    }

    public void updateScoreAndQualBug(){
        score = 0;
        lowQualBug = 0;
        medQualBug = 0;
        hghQualBug = 0;
        ListIterator<Bug> iterator = bugList.listIterator();
        while(iterator.hasNext()){
            double bugScore = iterator.next().getScore();
            if(bugScore < 3){
                lowQualBug++;
            }
            else if (bugScore < 7){
                medQualBug++;
            }
            else{
                hghQualBug++;
            }
            score += bugScore;
        }
    }

    public void updateBugList(){
        bugList.clear();
        LinkedList<Bug> paraQueCompile = new LinkedList<>();
        for(Bug it : paraQueCompile){
            bugList.add(it);
        }
    }

    public double getScore(){
        return score;
    }

    public int getLowQualBug(){
        return lowQualBug;
    }

    public int getMedQualBug(){
        return medQualBug;
    }

    public int getHghQualBug(){
        return hghQualBug;
    }

    public LinkedList<Bug> getBugList(){
        return bugList;
    }

    public Site getSite(){
        return site;
    }
}