package gwu.openre.relation;

public class RelationEntity implements RelationEntityMethod {
	public String getComName(){
        return "IBM";
    }
    public String getRelatedName(){
        return "Intel";
    }
    public int getLine(){
        return 0;
    }
    public int getDocID(){
        return 0;
    }
}
