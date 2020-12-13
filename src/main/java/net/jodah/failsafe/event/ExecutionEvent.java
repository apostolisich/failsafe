/*
 * Copyright 2018 the original author or authors.
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
 * limitations under the License
 */
package net.jodah.failsafe.event;

import net.jodah.failsafe.ExecutionContext;

import java.time.Duration;

/**
 * Encapsulates information about a Failsafe execution.
 *
 * @author Jonathan Halterman
 */
public class ExecutionEvent {
  private final ExecutionContext context;

  ExecutionEvent(ExecutionContext context) {
    this.context = context;
  }

  /**
   * Returns the elapsed time since initial execution began.
   */
  public Duration getElapsedTime() {
    return context.getElapsedTime();
  }

  /**
   * Gets the number of completed execution attempts so far.
   */
  public int getAttemptCount() {
    return context.getAttemptCount();
  }

  /**
   * Returns the time that the initial execution started.
   */
  public Duration getStartTime() {
    return context.getStartTime();
  }
}
