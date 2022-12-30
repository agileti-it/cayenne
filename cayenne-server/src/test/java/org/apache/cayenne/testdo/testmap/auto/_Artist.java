package org.apache.cayenne.testdo.testmap.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.DateProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericIdProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.SelfProperty;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.testdo.testmap.ArtGroup;
import org.apache.cayenne.testdo.testmap.Artist;
import org.apache.cayenne.testdo.testmap.ArtistExhibit;
import org.apache.cayenne.testdo.testmap.Award;
import org.apache.cayenne.testdo.testmap.Painting;

/**
 * Class _Artist was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 *
 * Example of a comment
 *
 */
public abstract class _Artist extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final SelfProperty<Artist> SELF = PropertyFactory.createSelf(Artist.class);

    public static final NumericIdProperty<Long> ARTIST_ID_PK_PROPERTY = PropertyFactory.createNumericId("ARTIST_ID", "Artist", Long.class);
    public static final String ARTIST_ID_PK_COLUMN = "ARTIST_ID";

    public static final StringProperty<String> ARTIST_NAME = PropertyFactory.createString("artistName", String.class);
    public static final DateProperty<Date> DATE_OF_BIRTH = PropertyFactory.createDate("dateOfBirth", Date.class);
    public static final ListProperty<ArtistExhibit> ARTIST_EXHIBIT_ARRAY = PropertyFactory.createList("artistExhibitArray", ArtistExhibit.class);
    public static final ListProperty<Award> AWARD_ARRAY = PropertyFactory.createList("awardArray", Award.class);
    public static final ListProperty<ArtGroup> GROUP_ARRAY = PropertyFactory.createList("groupArray", ArtGroup.class);
    public static final ListProperty<Painting> PAINTING_ARRAY = PropertyFactory.createList("paintingArray", Painting.class);

    protected String artistName;
    protected Date dateOfBirth;

    protected Object artistExhibitArray;
    protected Object awardArray;
    protected Object groupArray;
    protected Object paintingArray;

    public void setArtistName(String artistName) {
        beforePropertyWrite("artistName", this.artistName, artistName);
        this.artistName = artistName;
    }

    public String getArtistName() {
        beforePropertyRead("artistName");
        return this.artistName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        beforePropertyWrite("dateOfBirth", this.dateOfBirth, dateOfBirth);
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth() {
        beforePropertyRead("dateOfBirth");
        return this.dateOfBirth;
    }

    public void addToArtistExhibitArray(ArtistExhibit obj) {
        addToManyTarget("artistExhibitArray", obj, true);
    }

    public void removeFromArtistExhibitArray(ArtistExhibit obj) {
        removeToManyTarget("artistExhibitArray", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ArtistExhibit> getArtistExhibitArray() {
        return (List<ArtistExhibit>)readProperty("artistExhibitArray");
    }

    public void addToAwardArray(Award obj) {
        addToManyTarget("awardArray", obj, true);
    }

    public void removeFromAwardArray(Award obj) {
        removeToManyTarget("awardArray", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Award> getAwardArray() {
        return (List<Award>)readProperty("awardArray");
    }

    public void addToGroupArray(ArtGroup obj) {
        addToManyTarget("groupArray", obj, true);
    }

    public void removeFromGroupArray(ArtGroup obj) {
        removeToManyTarget("groupArray", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<ArtGroup> getGroupArray() {
        return (List<ArtGroup>)readProperty("groupArray");
    }

    public void addToPaintingArray(Painting obj) {
        addToManyTarget("paintingArray", obj, true);
    }

    public void removeFromPaintingArray(Painting obj) {
        removeToManyTarget("paintingArray", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Painting> getPaintingArray() {
        return (List<Painting>)readProperty("paintingArray");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "artistName":
                return this.artistName;
            case "dateOfBirth":
                return this.dateOfBirth;
            case "artistExhibitArray":
                return this.artistExhibitArray;
            case "awardArray":
                return this.awardArray;
            case "groupArray":
                return this.groupArray;
            case "paintingArray":
                return this.paintingArray;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "artistName":
                this.artistName = (String)val;
                break;
            case "dateOfBirth":
                this.dateOfBirth = (Date)val;
                break;
            case "artistExhibitArray":
                this.artistExhibitArray = val;
                break;
            case "awardArray":
                this.awardArray = val;
                break;
            case "groupArray":
                this.groupArray = val;
                break;
            case "paintingArray":
                this.paintingArray = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.artistName);
        out.writeObject(this.dateOfBirth);
        out.writeObject(this.artistExhibitArray);
        out.writeObject(this.awardArray);
        out.writeObject(this.groupArray);
        out.writeObject(this.paintingArray);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.artistName = (String)in.readObject();
        this.dateOfBirth = (Date)in.readObject();
        this.artistExhibitArray = in.readObject();
        this.awardArray = in.readObject();
        this.groupArray = in.readObject();
        this.paintingArray = in.readObject();
    }

}
