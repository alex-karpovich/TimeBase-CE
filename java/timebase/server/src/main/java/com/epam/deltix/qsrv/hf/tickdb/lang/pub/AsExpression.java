/*
 * Copyright 2021 EPAM Systems, Inc
 *
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.epam.deltix.qsrv.hf.tickdb.lang.pub;

import java.util.Objects;

/**
 *
 */
public class AsExpression extends ComplexExpression {
    public final Expression expression;
    public final CastTypeExpression castType;

    public AsExpression(long location, Expression expression, CastTypeExpression castType) {
        super(location, expression);
        this.expression = expression;
        this.castType = castType;
    }

    @Override
    protected void print(int outerPriority, StringBuilder s) {
        s.append("(");
        expression.print(outerPriority, s);
        s.append(" AS ");
        castType.print(s);
        s.append(")");
    }

    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AsExpression that = (AsExpression) o;
        return Objects.equals(castType, that.castType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode()) + 31 * Objects.hashCode(castType);
    }
}