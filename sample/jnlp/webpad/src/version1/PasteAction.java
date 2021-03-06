/*
 * Copyright (c) 2006, 2010, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * -Redistribution of source code must retain the above copyright notice, this
 *  list of conditions and the following disclaimer.
 *
 * -Redistribution in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and/or other materials provided with the distribution.
 *
 * Neither the name of Oracle nor the names of contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING
 * ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN MICROSYSTEMS, INC. ("SUN")
 * AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE
 * AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR ANY LOST
 * REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL,
 * INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY
 * OF LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO USE THIS SOFTWARE,
 * EVEN IF SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that this software is not designed, licensed or intended
 * for use in the design, construction, operation or maintenance of any
 * nuclear facility.
 */

import javax.swing.Action;

/**
 * Represents the Paste Action.
 *
 */
public class PasteAction extends JLFAbstractAction {

    private static final String ACTION_COMMAND_KEY_PASTE = "paste-command";
    private static final String NAME_PASTE = "Paste";
    private static final String SMALL_ICON_PASTE = "Paste16.gif";
    private static final String LARGE_ICON_PASTE = "Paste24.gif";
    private static final String SHORT_DESCRIPTION_PASTE = "Paste";
    private static final String LONG_DESCRIPTION_PASTE = "Insert an object or data previously selected via \"Copy\" or \"Cut\"";
    private static final int MNEMONIC_KEY_PASTE = 'P';

    /**
     * ctor
     */
    public PasteAction() {
        putValue(Action.NAME, NAME_PASTE);
        putValue(Action.SMALL_ICON, getIcon(SMALL_ICON_PASTE));
        putValue(LARGE_ICON, getIcon(LARGE_ICON_PASTE));
        putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION_PASTE);
        putValue(Action.LONG_DESCRIPTION, LONG_DESCRIPTION_PASTE);
        putValue(Action.MNEMONIC_KEY, new Integer(MNEMONIC_KEY_PASTE));
        putValue(Action.ACTION_COMMAND_KEY, ACTION_COMMAND_KEY_PASTE);
    }
}
