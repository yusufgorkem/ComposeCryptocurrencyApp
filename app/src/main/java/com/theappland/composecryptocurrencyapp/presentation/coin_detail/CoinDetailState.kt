package com.theappland.composecryptocurrencyapp.presentation.coin_detail

import com.theappland.composecryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
