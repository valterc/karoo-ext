/**
 * Copyright (c) 2024 Hammerhead Navigation Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.hammerhead.karooext.models

import kotlinx.serialization.Serializable

/**
 * A device from an extension with name and supported types.
 */
@Serializable
data class Device(
    /**
     * Extension id
     */
    val extension: String,
    /**
     * Unique ID of this device within the extension
     */
    val uid: String,
    /**
     * Data types supported by this source
     */
    val dataTypes: List<String>,
    /**
     * Human recognizable name of this device
     */
    val displayName: String,
)
