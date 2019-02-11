/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;

import java.io.IOException;
import java.util.Map;

/**
 * {@link BaseHttpStack} implementation wrapping a {@link HttpStack}.
 *
 * <p>{@link BasicNetwork} uses this if it is provided a {@link HttpStack} at construction time,
 * allowing it to have one implementation based atop {@link BaseHttpStack}.
 */
@SuppressWarnings("deprecation")
class AdaptedHttpStack extends BaseHttpStack {

    AdaptedHttpStack(HttpStack httpStack) { }

    @Override
    public HttpResponse executeRequest(Request<?> request, Map<String, String> additionalHeaders)
            throws IOException, AuthFailureError {
        // STUB
        return null;
    }
}
