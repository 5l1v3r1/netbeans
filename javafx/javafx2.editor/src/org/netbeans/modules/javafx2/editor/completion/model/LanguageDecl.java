/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.javafx2.editor.completion.model;

import javax.lang.model.element.TypeElement;
import org.netbeans.api.java.source.ElementHandle;
import org.netbeans.api.java.source.TypeMirrorHandle;
import org.netbeans.modules.javafx2.editor.completion.beans.FxDefinition;

/**
 *
 * @author sdedic
 */
public final class LanguageDecl extends FxNode {
    private String  language;

    public String getLanguage() {
        return language;
    }

    LanguageDecl(String langage) {
        this.language = langage;
    }

    @Override
    public Kind getKind() {
        return Kind.Language;
    }

    @Override
    public void accept(FxNodeVisitor v) {
        v.visitLanguage(this);
    }

    public String getSourceName() {
        return FxXmlSymbols.FX_LANGUAGE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    void resolve(ElementHandle nameHandle, TypeMirrorHandle typeHandle, ElementHandle<TypeElement> sourceTypeHandle, FxDefinition info) {
    }
}
