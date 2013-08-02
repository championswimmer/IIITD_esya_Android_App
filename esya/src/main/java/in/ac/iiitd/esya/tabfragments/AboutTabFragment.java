/*
 * Copyright (c) 2013. Arnav Gupta
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License, version 3, as
 *     published by
 *     the Free Software Foundation.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package in.ac.iiitd.esya.tabfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.ac.iiitd.esya.R;

/**
 * Created by championswimmer on 25/7/13.
 */
public class AboutTabFragment extends Fragment {
    /* TODO
    * Major TODO here.
    * Handle the clicks of the various events and show them in
    * dialog boxes.
    * */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            // We have different layouts, and in one of them this
            // fragment's containing frame doesn't exist.  The fragment
            // may still be created from its saved state, but there is
            // no reason to try to create its view hierarchy because it
            // won't be displayed.  Note this is not needed -- we could
            // just run the code below, where we would create and return
            // the view hierarchy; it would just never be used.
            return null;
        }
        return inflater.inflate(R.layout.tab_fragment_about, container, false);
    }
}