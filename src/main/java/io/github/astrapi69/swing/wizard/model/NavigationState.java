/**
 * The MIT License
 *
 * Copyright (C) 2021 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.swing.wizard.model;

import io.github.astrapi69.swing.wizard.NavigationPanel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * The enum {@link NavigationState} holds several navigation states that can occur. Can be used to
 * validate and set the {@link NavigationPanel}.
 */
@Getter
@ToString
@AllArgsConstructor
public enum NavigationState
{

	/**
	 * Cancel navigation state.
	 */
	CANCEL(false, false, true, false),

	/**
	 * Cancel finish navigation state.
	 */
	CANCEL_FINISH(false, false, true, true),

	/**
	 * Next cancel finish navigation state.
	 */
	NEXT_CANCEL_FINISH(false, true, true, true),

	/**
	 * Previous next cancel finish navigation state.
	 */
	PREVIOUS_NEXT_CANCEL_FINISH(true, true, true, true),

	/**
	 * Reset navigation state.
	 */
	RESET(false, false, false, false);

	/** The flag that signals if cancel is valid or not. */
	private final boolean validCancel;

	/** The flag that signals if finish is valid or not. */
	private final boolean validFinish;

	/** The flag that signals if next is valid or not. */
	private final boolean validNext;

	/** The flag that signals if previous is valid or not. */
	private final boolean validPrevious;
}
