package me.magical.graceful.mvvm.viewModel

import me.magical.graceful.mvvm.model.NewsModel
import me.magical.graceful.request.bean.NewsBean
import me.magical.graceful.request.bean.NewsBean1
import me.magical.mvvmgraceful.base.BaseViewModel
import me.magical.mvvmgraceful.helper.uiRequest
import me.magical.mvvmgraceful.livedata.UnFlowLiveData
import me.magical.mvvmgraceful.request.core.DataState
import javax.inject.Inject


class NewsVM @Inject constructor() : BaseViewModel() {

    var newModel: NewsModel = NewsModel()

    var resultState: UnFlowLiveData<DataState<NewsBean>> = UnFlowLiveData()

    fun currentNews() {
        uiRequest(resultState, {
            newModel.getNews()
        })
    }
}