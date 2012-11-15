/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/
package org.apache.cayenne.dba;

import org.apache.cayenne.map.DbEntity;

/**
 * @since 3.0
 */
public interface QuotingStrategy {

    /**
     * Returns a properly quoted identifier.
     * 
     * @deprecated use {@link #quotedIdentifier(String...)}
     */
    @Deprecated
    String quoteString(String identifier);

    /**
     * @deprecated since 3.2 renamed to
     *             {@link #quotedFullyQualifiedName(DbEntity)}.
     */
    @Deprecated
    String quoteFullyQualifiedName(DbEntity entity);

    /**
     * Builds a fully qualified name from catalog, schema, name parts of
     * DbEntity, inclosing them in quotations according to this strategy
     * algorithm. Analog of "quotedIdentifier(entity.getCatalog(),
     * entity.getSchema(), entity.getName())".
     * 
     * @since 3.2
     */
    String quotedFullyQualifiedName(DbEntity entity);

    /**
     * Builds a dot-separated qualifier, inclosing parts in quotations according
     * to this strategy algorithm. Any of the parts can be null, in which case
     * it will be skipped.
     * 
     * @since 3.2
     */
    String quotedIdentifier(String... identifierParts);
}
