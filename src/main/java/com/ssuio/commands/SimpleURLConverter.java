/*
 * Copyright 2000-2017 JetBrains s.r.o.
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
package com.ssuio.commands;

import org.springframework.shell.core.Completion;
import org.springframework.shell.core.Converter;
import org.springframework.shell.core.MethodTarget;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Component
public class SimpleURLConverter implements Converter<URL> {

  public URL convertFromText(
    String value, Class<?> requiredType, String optionContext) {
    URL url = null;
    try {
       url = new URL(value);
    }
    catch (MalformedURLException e) {
      e.printStackTrace();
    }

    return url;
  }

  public boolean getAllPossibleValues(
    List<Completion> completions,
    Class<?> requiredType,
    String existingData,
    String optionContext,
    MethodTarget target) {
    return false;
  }

  public boolean supports(Class<?> requiredType, String optionContext) {
    return URL.class.isAssignableFrom(requiredType);
  }
}