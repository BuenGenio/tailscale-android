// Copyright (c) Tailscale Inc & AUTHORS
// SPDX-License-Identifier: BSD-3-Clause

package com.tailscale.ipn.ui.view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.tailscale.ipn.R

// antscale white-label: the brand mark shown on the intro, welcome, about and
// loading screens. Renders the antscale logo. The `animated` and
// `usesOnBackgroundColors` params are kept for source-compatibility with the
// existing call sites.
@Composable
fun TailscaleLogoView(
    animated: Boolean = false,
    usesOnBackgroundColors: Boolean = false,
    modifier: Modifier
) {
  Image(
      painter = painterResource(id = R.mipmap.ic_launcher_foreground),
      contentDescription = "Antscale",
      contentScale = ContentScale.Fit,
      modifier = modifier)
}
