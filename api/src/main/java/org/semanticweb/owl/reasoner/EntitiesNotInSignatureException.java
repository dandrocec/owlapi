package org.semanticweb.owl.reasoner;

import org.semanticweb.owl.model.OWLEntity;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Collections;/*
 * Copyright (C) 2008, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

/**
 * Author: Matthew Horridge<br> The University of Manchester<br> Information Management Group<br>
 * Date: 21-Jan-2009
 *
 * Indicates that the signature of a set of entities is disjoint with the signature of the union of
 * the axioms in a set of ontologies.
 */
public abstract class EntitiesNotInSignatureException extends OWLReasonerRuntimeException {

    private Set<OWLEntity> entities;

    public EntitiesNotInSignatureException(Set<OWLEntity> entities) {
        this.entities = Collections.unmodifiableSet(new LinkedHashSet<OWLEntity>(entities));
    }


    /**
     * Gets the entities
     * @return The entities, none of which are contained in the signature of the union of a set of ontologies.
     */
    public Set<OWLEntity> getEntities() {
        return entities;
    }


    /**
     * Returns the detail message string of this throwable.
     * @return the detail message string of this <tt>Throwable</tt> instance
     *         (which may be <tt>null</tt>).
     */
    public String getMessage() {
        return entities + " not in signature";
    }
}
