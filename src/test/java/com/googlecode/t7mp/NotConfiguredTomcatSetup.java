/**
 * Copyright (C) 2010 Joerg Bellmann <joerg.bellmann@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.googlecode.t7mp;

/**
 * This class should not pass the validateConfiguration()-method
 * 
 *
 */
public class NotConfiguredTomcatSetup extends AbstractTomcatSetup {

    public NotConfiguredTomcatSetup(AbstractT7Mojo t7Mojo) {
        super(t7Mojo);
    }

    @Override
    protected void configure() throws TomcatSetupException {
        // Do Nothing here			
    }

}