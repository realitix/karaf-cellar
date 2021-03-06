/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.karaf.cellar.log;

import org.apache.karaf.cellar.core.command.Result;

import java.util.Map;

public class GetLogResult extends Result {

    protected Map<String, String> loggers;

    public GetLogResult(String id) {
        super(id);
    }

    public GetLogResult(String id, Map<String, String> loggers) {
        super(id);
        this.loggers = loggers;
    }

    public Map<String, String> getLoggers() {
        return loggers;
    }

    public void setLoggers(Map<String, String> loggers) {
        this.loggers = loggers;
    }

}
