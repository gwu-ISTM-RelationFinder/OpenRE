package gwu.openre.relation;


/**
 *
 * @author Administrator
 */
public class AllianceEntity extends RelationEntity {
    public AllianceEntity(){
        comName = "IBM";
        relatedName = "IBM";
        lineInSTC = 0;
        docID =0;
    }
    public AllianceEntity(String com, String com2, int line, int doc){
        comName = com;
        relatedName = com2;
        lineInSTC = line;
        docID = doc;
    }


    public String getComName(){
        return comName;
    }
    public String getRelatedName(){
        return relatedName;
    }
    public int getLine(){
        return lineInSTC;
    }
    public int getDocID(){
        return docID;
    }

    private String comName;
    private String relatedName;
    private int lineInSTC;
    private int docID;
}

