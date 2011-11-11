/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class FArrays3 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord> {

	private static final long serialVersionUID = 952034804;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FArrays3() {
		super(org.jooq.SQLDialect.ORACLE, "F_ARRAYS3", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.VARCHAR.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setInArray(org.jooq.Field<org.jooq.test.oracle.generatedclasses.udt.records.UStringArrayRecord> field) {
		setField(IN_ARRAY, field);
	}
}
