package uk.co.bigdogconsultants;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Treet implements Comparable, Serializable {

    private String mAuthor;
    private String mDescription;
    private Date mCreationDate;

    public Treet(String author, String description, Date date){
        mAuthor = author;
        mDescription = description;
        mCreationDate = date;
    }

    public String getAuthor() {
	return mAuthor;
    }

    public String getDescription(){
	return mDescription;
    }

    public Date getCreationDate() {
	return mCreationDate;
    }
    @Override
    public String toString() {
	return String.format("Treet: \"%s\" by %s on %s",  
		mDescription, mAuthor, mCreationDate);
    }

    @Override
    public int compareTo (Object obj){
	Treet other = (Treet) obj;
	if (equals(other)){
		return 0;
        }
	int dateCmp = mCreationDate.compareTo(other.mCreationDate);
	if (dateCmp == 0) {
	    return mDescription.compareTo(other.mDescription);
	}
	return dateCmp;
    }

    public String [] getWords() {
	return mDescription.toLowerCase().split("[^\\w#@']+");
    }
  
}
