// Copyright (c) Tailscale Inc & AUTHORS
// SPDX-License-Identifier: BSD-3-Clause

package com.tailscale.ipn.ui.view
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.tailscale.ipn.ui.theme.link

@Composable
fun PrimaryActionButton(onClick: () -> Unit, content: @Composable RowScope.() -> Unit) {
  // antscale brand gradient (logo blue -> violet -> coral)
  Button(
      onClick = onClick,
      contentPadding = PaddingValues(vertical = 12.dp),
      colors =
          ButtonDefaults.buttonColors(
              containerColor = Color.Transparent, contentColor = Color.White),
      modifier =
          Modifier.fillMaxWidth()
              .background(
                  brush =
                      Brush.horizontalGradient(
                          listOf(Color(0xFF6F8FD8), Color(0xFFA97FB8), Color(0xFFE0697F))),
                  shape = ButtonDefaults.shape),
      content = content)
}

@Composable
fun OpenURLButton(title: String, url: String) {
  val handler = LocalUriHandler.current

  TextButton(onClick = { handler.openUri(url) }) {
    Text(
        title,
        style = MaterialTheme.typography.bodyMedium,
        color = MaterialTheme.colorScheme.link,
        textDecoration = TextDecoration.Underline,
    )
  }
}
