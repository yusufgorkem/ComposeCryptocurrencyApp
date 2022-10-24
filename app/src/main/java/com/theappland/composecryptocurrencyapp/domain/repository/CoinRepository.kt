package com.theappland.composecryptocurrencyapp.domain.repository

import com.theappland.composecryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.theappland.composecryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId: String) : CoinDetailDto
}