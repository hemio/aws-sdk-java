/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeAddressesResult implements Serializable, Cloneable {

    /**
     * <p>
     * </p>
     */
    private java.util.List<Address> addresses;
    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public java.util.List<Address> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * </p>
     * 
     * @param addresses
     */

    public void setAddresses(java.util.Collection<Address> addresses) {
        if (addresses == null) {
            this.addresses = null;
            return;
        }

        this.addresses = new java.util.ArrayList<Address>(addresses);
    }

    /**
     * <p>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAddresses(java.util.Collection)} or
     * {@link #withAddresses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param addresses
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAddressesResult withAddresses(Address... addresses) {
        if (this.addresses == null) {
            setAddresses(new java.util.ArrayList<Address>(addresses.length));
        }
        for (Address ele : addresses) {
            this.addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param addresses
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAddressesResult withAddresses(
            java.util.Collection<Address> addresses) {
        setAddresses(addresses);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. If you use the automatically
     *        generated <code>NextToken</code> value in your next
     *        <code>DescribeAddresses</code> call, your list of returned
     *        addresses will start from this point in the array.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     * 
     * @return HTTP requests are stateless. If you use the automatically
     *         generated <code>NextToken</code> value in your next
     *         <code>DescribeAddresses</code> call, your list of returned
     *         addresses will start from this point in the array.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>DescribeAddresses</code>
     * call, your list of returned addresses will start from this point in the
     * array.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. If you use the automatically
     *        generated <code>NextToken</code> value in your next
     *        <code>DescribeAddresses</code> call, your list of returned
     *        addresses will start from this point in the array.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAddressesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAddresses() != null)
            sb.append("Addresses: " + getAddresses() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddressesResult == false)
            return false;
        DescribeAddressesResult other = (DescribeAddressesResult) obj;
        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null
                && other.getAddresses().equals(this.getAddresses()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddressesResult clone() {
        try {
            return (DescribeAddressesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}