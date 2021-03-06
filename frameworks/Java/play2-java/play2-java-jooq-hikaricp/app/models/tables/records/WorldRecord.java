/*
 * This file is generated by jOOQ.
*/
package models.tables.records;


import javax.annotation.Generated;

import models.tables.World;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorldRecord extends UpdatableRecordImpl<WorldRecord> implements Record2<UInteger, Integer> {

    private static final long serialVersionUID = -826288699;

    /**
     * Setter for <code>hello_world.world.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>hello_world.world.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>hello_world.world.randomNumber</code>.
     */
    public void setRandomnumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>hello_world.world.randomNumber</code>.
     */
    public Integer getRandomnumber() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return World.WORLD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return World.WORLD.RANDOMNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRandomnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRandomnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorldRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorldRecord value2(Integer value) {
        setRandomnumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WorldRecord values(UInteger value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorldRecord
     */
    public WorldRecord() {
        super(World.WORLD);
    }

    /**
     * Create a detached, initialised WorldRecord
     */
    public WorldRecord(UInteger id, Integer randomnumber) {
        super(World.WORLD);

        set(0, id);
        set(1, randomnumber);
    }
}
