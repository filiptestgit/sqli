/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.xream.sqli.builder;


import java.util.List;

/**
 * @Author Sim
 */
public class BuildingBlock {

    private ConjunctionAndOtherScript conjunction;
    private PredicateAndOtherScript predicate;
    private String key;
    private Object value;
    private List<BuildingBlock> subList;
    private BuildingBlock parent;
    private transient String script;
    public BuildingBlock(){}
    public BuildingBlock(boolean isOr){
        if (isOr)
            conjunction = ConjunctionAndOtherScript.OR;
        else
            conjunction = ConjunctionAndOtherScript.AND;
    }
    public ConjunctionAndOtherScript getConjunction() {
        return conjunction;
    }
    public void setConjunction(ConjunctionAndOtherScript conjunction) {
        this.conjunction = conjunction;
    }
    public PredicateAndOtherScript getPredicate() {
        return predicate;
    }
    public void setPredicate(PredicateAndOtherScript predicate) {
        this.predicate = predicate;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public List<BuildingBlock> getSubList() {
        return subList;
    }
    public void setSubList(List<BuildingBlock> subList) {
        this.subList = subList;
    }
    public BuildingBlock getParent() {
        return parent;
    }
    public void setParent(BuildingBlock parent) {
        this.parent = parent;
    }
    public String getScript() {
        return script;
    }
    public void setScript(String script) {
        this.script = script;
    }

    @Override
    public String toString() {
        return "X{" +
                "conjunction=" + conjunction +
                ", predicate=" + predicate +
                ", key=" + key +
                ", value=" + value +
                ", subList=" + subList +
                ", script=" + script +
                '}';
    }
}
