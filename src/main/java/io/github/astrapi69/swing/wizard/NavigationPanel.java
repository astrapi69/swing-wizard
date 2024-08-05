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
package io.github.astrapi69.swing.wizard;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

import io.github.astrapi69.model.BaseModel;
import io.github.astrapi69.model.api.IModel;
import io.github.astrapi69.swing.base.BasePanel;
import lombok.Getter;

/**
 * The class {@link NavigationPanel} provides navigation buttons for a wizard.
 *
 * @param <T>
 *            the generic type of the model object
 */
@Getter
public class NavigationPanel<T> extends BasePanel<T>
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The cancel button. */
	private JButton btnCancel;

	/** The finish button. */
	private JButton btnFinish;

	/** The next button. */
	private JButton btnNext;

	/** The previous button. */
	private JButton btnPrevious;

	/**
	 * Instantiates a new {@link NavigationPanel}.
	 */
	public NavigationPanel()
	{
		this(BaseModel.of());
	}

	/**
	 * Instantiates a new {@link NavigationPanel}.
	 *
	 * @param model
	 *            the model
	 */
	public NavigationPanel(IModel<T> model)
	{
		super(model);
	}

	/**
	 * Creates a new cancel button with the given label.
	 *
	 * @param label
	 *            the label for the button
	 * @return the new cancel button
	 */
	protected JButton newCancelButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onCancel());
		return button;
	}

	/**
	 * Creates a new finish button with the given label.
	 *
	 * @param label
	 *            the label for the button
	 * @return the new finish button
	 */
	protected JButton newFinishButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onFinish());
		return button;
	}

	/**
	 * Creates a new next button with the given label.
	 *
	 * @param label
	 *            the label for the button
	 * @return the new next button
	 */
	protected JButton newNextButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onNext());
		return button;
	}

	/**
	 * Creates a new previous button with the given label.
	 *
	 * @param label
	 *            the label for the button
	 * @return the new previous button
	 */
	protected JButton newPreviousButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onPrevious());
		return button;
	}

	/**
	 * Callback method for the cancel action.
	 */
	protected void onCancel()
	{
	}

	/**
	 * Callback method for the finish action.
	 */
	protected void onFinish()
	{
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onInitializeComponents()
	{
		btnNext = newNextButton("Next");
		btnPrevious = newPreviousButton("Previous");
		btnCancel = newCancelButton("Cancel");
		btnFinish = newFinishButton("Finish");
		add(btnPrevious);
		add(btnNext);
		add(btnCancel);
		add(btnFinish);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onInitializeLayout()
	{
		setBorder(new LineBorder(Color.BLACK));
	}

	/**
	 * Callback method for the next action.
	 */
	protected void onNext()
	{
	}

	/**
	 * Callback method for the previous action.
	 */
	protected void onPrevious()
	{
	}
}
