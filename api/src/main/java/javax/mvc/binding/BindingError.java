/*
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2016-2018 JSR 371 expert group and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.mvc.binding;

/**
 * <p>Represents a single error that occurred while binding a parameter to a controller
 * method argument or controller field using a binding annotation like 
 * {@link javax.ws.rs.FormParam}.</p>
 *
 * @author Christian Kaltepoth
 * @since 1.0
 */
public interface BindingError extends ParamError {

    /**
     * Provides access to the raw submitted value of the parameter which caused the
     * binding to fail.
     *
     * @return The raw value submitted for the parameter
     */
    String getSubmittedValue();

}
