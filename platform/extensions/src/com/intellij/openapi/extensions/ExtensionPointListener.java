// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.extensions;

import org.jetbrains.annotations.NotNull;

/**
 * See {@link ExtensionPointChangeListener}
 */
public interface ExtensionPointListener<T> {
  default void extensionAdded(@NotNull T extension, @NotNull PluginDescriptor pluginDescriptor) { }

  default void extensionRemoved(@NotNull T extension, @NotNull PluginDescriptor pluginDescriptor) { }

  @SuppressWarnings("unchecked")
  static <T> ExtensionPointListener<T> @NotNull [] emptyArray() {
    return (ExtensionPointListener<T>[])EMPTY_ARRAY;
  }

  ExtensionPointListener<?>[] EMPTY_ARRAY = new ExtensionPointListener<?>[0];
}
