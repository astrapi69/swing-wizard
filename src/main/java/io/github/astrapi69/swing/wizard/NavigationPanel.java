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

import lombok.Getter;
import io.github.astrapi69.model.BaseModel;
import io.github.astrapi69.model.api.IModel;
import io.github.astrapi69.swing.base.BasePanel;

/**
 * The class {@link NavigationPanel}.
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

	protected JButton newCancelButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onCancel());
		return button;
	}

	protected JButton newFinishButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onFinish());
		return button;
	}

	protected JButton newNextButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onNext());
		return button;
	}

	protected JButton newPreviousButton(final String label)
	{
		final JButton button = new JButton(label);
		button.addActionListener(e -> onPrevious());
		return button;
	}

	protected void onCancel()
	{
	}

	protected void onFinish()
	{
	}

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

	@Override
	protected void onInitializeLayout()
	{
		setBorder(new LineBorder(Color.BLACK));
	}

	protected void onNext()
	{
	}

	protected void onPrevious()
	{
	}

}
