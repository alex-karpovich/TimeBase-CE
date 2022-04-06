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
package com.epam.deltix.qsrv.hf.tickdb.lang.runtime.std;

import com.epam.deltix.qsrv.hf.tickdb.lang.pub.*;
import com.epam.deltix.qsrv.hf.tickdb.lang.runtime.Varchar;
import com.epam.deltix.util.lang.Util;

/**
 *  Aggregate MIN (VARCHAR)
 */
@Aggregate @FunctionInfo (id = "MIN", returns = "VARCHAR?", args = { "VARCHAR?" })
public final class MinVarchar {
    private Varchar         minValue = new Varchar ();

    public CharSequence     get () {
        return (minValue.get ());
    }

    public void         set1 (CharSequence v) {
        CharSequence        mvcs = minValue.get ();
                
        if (v != null &&
            (mvcs == null || Util.compare (v, mvcs, false) < 0))
            minValue.set (v);
    }        
}