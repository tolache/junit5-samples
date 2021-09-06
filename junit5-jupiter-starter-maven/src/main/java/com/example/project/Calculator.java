/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

public class Calculator {
	private Calculator() {}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) { throw new UnsupportedOperationException("Write a test first."); }

}
