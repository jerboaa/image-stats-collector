/*
 * Copyright (c) 2022 Contributors to the Collector project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.redhat.quarkus.mandrel.collector.report.model.graal;

public class ExecutableStats {

    private long total;
    private long reachable;
    private long reflection;
    private long jni;
    
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public long getReachable() {
        return reachable;
    }
    public void setReachable(long reachable) {
        this.reachable = reachable;
    }
    public long getReflection() {
        return reflection;
    }
    public void setReflection(long reflection) {
        this.reflection = reflection;
    }
    public long getJni() {
        return jni;
    }
    public void setJni(long jni) {
        this.jni = jni;
    }
    
}
