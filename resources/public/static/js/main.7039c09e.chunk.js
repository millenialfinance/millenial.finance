(this.webpackJsonpdemozap=this.webpackJsonpdemozap||[]).push([[0],{1232:function(e,_){},1243:function(e,_){},1258:function(e,_){},131:function(e,_,t){"use strict";t.d(_,"a",(function(){return p})),t.d(_,"b",(function(){return f}));var a=t(3),r=t.n(a),n=t(162),c=t(24),l=t(735),o=t.n(l),i=t(88),s=t(7),u=t.n(s),d=t(736),E=t.n(d),b=t(739),m=t.n(b),O=t(138),p=u.a.createContext({}),h={walletconnect:{package:o.a,options:{rpc:{100:Object(O.a)(100),137:Object(O.a)(137)}}}},D=new m.a({cacheProvider:!0,providerOptions:h}),f=function(e){var _=e.children,t=Object(s.useState)({}),a=Object(c.a)(t,2),l=a[0],o=a[1],d=l.providerChainId,b=l.ethersProvider,m=l.web3Provider,O=Object(s.useState)(),h=Object(c.a)(O,2),f=h[0],P=h[1],C=Object(s.useState)(),M=Object(c.a)(C,2),v=M[0],A=M[1],g=Object(s.useState)(!0),T=Object(c.a)(g,2),B=T[0],I=T[1],S=Object(s.useCallback)(function(){var e=Object(n.a)(r.a.mark((function e(_){var t,a,n,c,l,s,u,d=arguments;return r.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:if(t=d.length>1&&void 0!==d[1]&&d[1],e.prev=1,!_){e.next=19;break}return a=new E.a(_),n=new i.ethers.providers.Web3Provider(a.currentProvider),e.next=7,n.getNetwork();case 7:if(c=e.sent,o({ethersProvider:n,web3Provider:_,providerChainId:c.chainId}),!t){e.next=19;break}return l=n.getSigner(),e.next=13,l.getAddress();case 13:return s=e.sent,e.next=16,l.getBalance();case 16:u=e.sent,P(s),A(u);case 19:e.next=24;break;case 21:e.prev=21,e.t0=e.catch(1),console.log({web3ModalError:e.t0});case 24:case"end":return e.stop()}}),e,null,[[1,21]])})));return function(_){return e.apply(this,arguments)}}(),[]),R=Object(s.useCallback)(Object(n.a)(r.a.mark((function e(){var _;return r.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:return e.prev=0,I(!0),e.next=4,D.connect();case 4:return _=e.sent,e.next=7,S(_,!0);case 7:_.on("accountsChanged",(function(e){P(e[0])})),_.on("chainChanged",(function(e){S(_)})),e.next=14;break;case 11:e.prev=11,e.t0=e.catch(0),console.log({web3ModalError:e.t0});case 14:I(!1);case 15:case"end":return e.stop()}}),e,null,[[0,11]])}))),[S]),W=Object(s.useCallback)(Object(n.a)(r.a.mark((function e(){return r.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:D.clearCachedProvider(),P(),o({});case 3:case"end":return e.stop()}}),e)}))),[]);return Object(s.useEffect)((function(){window.ethereum&&(window.ethereum.autoRefreshOnNetworkChange=!1),D.cachedProvider?R():I(!1)}),[R]),u.a.createElement(p.Provider,{value:{ethersProvider:b,web3Provider:m,connectWeb3:R,loading:B,disconnect:W,providerChainId:d,account:f,balance:v}},_)}},1321:function(e,_){},138:function(e,_,t){"use strict";function a(e){switch(e){case 56:return"https://bsc-dataseed1.ninicoin.io/";case 100:return"https://xdai.poanetwork.dev/";case 128:return"https://http-mainnet.hecochain.com/";case 137:return"https://rpc-mainnet.maticvigil.com";case 250:return"https://rpcapi.fantom.network/";default:throw new Error("No RPC configured for network: ",e)}}t.d(_,"a",(function(){return a}))},1647:function(e,_){},1676:function(e,_,t){"use strict";t.r(_);var a=t(7),r=t.n(a),n=t(225),c=t.n(n),l=t(1759),o=t(1758),i=t(461),s=t(131),u=t(64),d=t(466),E=t(1748),b=t(1696),m=t(464);function O(e){switch(Number(e)){case 56:return"Binance Smart Chain";case 100:return"xDai Network";case 137:return"Matic Network";case 250:return"Fantom Opera";default:return"Unsupported Network"}}var p="linear-gradient(257.5deg, #EB0055 -39.73%, #FFFA80 107.97%)",h=function(e){var _=Object(a.useContext)(s.a),t=_.account,n=_.providerChainId;return r.a.createElement(E.a,{as:"nav",align:"center",wrap:"wrap",w:"100%",mb:"1rem",p:"1rem",bg:"transparent",direction:["column","row","row","row"],justify:["center","space-between","flex-end","flex-end"],borderBottom:"1px",borderColor:"gray.500"},r.a.createElement(b.a,{display:{sm:"none",md:"flex"},width:{sm:"full",md:"auto"},alignItems:"center",padding:"0.5rem",flexGrow:1}),r.a.createElement(b.a,{bgGradient:p,borderRadius:"1rem",direction:"column",align:"center",p:"0.5rem",m:"0.5rem",fontWeight:"light"},O(n)),r.a.createElement(b.a,null,t?r.a.createElement(m.a,{bgColor:"white",borderRadius:"1rem",direction:"column",align:"center",p:"0.5rem",m:"0.5rem",fontWeight:"light"},function(e){var _=arguments.length>1&&void 0!==arguments[1]?arguments[1]:4,t=2;return e?e.length<2*_+t?e:e.slice(0,_+t)+"\u2026"+e.slice(-_):""}(t)):r.a.createElement(m.a,{bgColor:"white",borderRadius:"1rem",direction:"column",align:"center",p:"0.5rem",m:"0.5rem",fontWeight:"light",disabled:!0},"No account found.")))},D=t(279),f=t(1760),P=function(){return r.a.createElement(E.a,{align:"center",direction:"column"},r.a.createElement(b.a,{width:{sm:"full",md:"auto"},w:[300,400,560],alignItems:"center",padding:"1.5rem",paddingTop:"2.5rem",paddingBottom:"2.5rem",bgColor:"white",boxShadow:"0px 1rem 2rem rgba(204, 218, 238, 0.8)",borderRadius:"1rem"},r.a.createElement(D.c,{disabled:!1})),r.a.createElement(b.a,{bgGradient:"linear-gradient(257.5deg, rgba(235, 0, 85, 0.3) -39.73%, rgba(255, 250, 128, 0.3) 107.97%)",w:[250,350,500],padding:"1rem",margin:"2rem",borderRadius:"lg",fontWeight:"light",bgColor:"white"},"This is beta software! Use at your own risk."),r.a.createElement(b.a,{width:{sm:"full",md:"auto"},w:[300,400,560],alignItems:"center",padding:"1rem",margin:"0.5rem",bgColor:"white",boxShadow:"0px 1rem 2rem rgba(204, 218, 238, 0.8)",borderRadius:"1rem"},r.a.createElement(V,null)),r.a.createElement(f.a,{src:"https://storage.googleapis.com/1hive/xpollinate/powered-by.svg",bottom:"0",h:"2rem",marginTop:"calc(5% + 60px)"}))},C=t(756),M="linear-gradient(257.5deg, #EB0055 -39.73%, #FFFA80 107.97%)",v="linear-gradient(257.5deg, rgba(235, 0, 85, 0.3) -39.73%, rgba(255, 250, 128, 0.3) 107.97%)",A=function(){var e=Object(a.useContext)(s.a),_=e.connectWeb3,t=e.loading,n=e.account,c=e.disconnect;return r.a.createElement(C.a,null,r.a.createElement(E.a,{bgColor:"white",bgGradient:v,boxShadow:"0px 1rem 2rem rgba(204, 218, 238, 0.8)",borderRadius:"1rem",direction:"column",align:"center",w:"calc(100% - 2rem)",p:"2rem",minW:"15rem"},r.a.createElement(f.a,{src:"https://storage.googleapis.com/1hive/xpollinate/logo.svg",alt:"xPollinate Logo"}),r.a.createElement(d.a,{fontWeight:"light",m:"1rem"},"Please, connect your wallet."),n&&!t?r.a.createElement(m.a,{onClick:c,colorScheme:"orange",px:12},"Disconnect"):r.a.createElement(m.a,{onClick:_,fontWeight:"light",_focus:{boxShadow:"outline"},_hover:{bg:M},bgGradient:M,maxW:"15rem",isLoading:t},"Connect")))},g=t(3),T=t.n(g),B=t(350),I=t(162),S=t(24),R=t(1753),W=t(1756),x=t(1761),L=t(1752),U=t(1754),w=t(1755),K=t(143),k=t(188),j=t(460),F=t(83),y=t(138),V=function(){var e=Object(a.useState)([]),_=Object(S.a)(e,2),t=_[0],n=_[1],c=Object(a.useState)(!0),l=Object(S.a)(c,2),o=l[0],i=l[1];return Object(a.useEffect)((function(){(function(){var e=Object(I.a)(T.a.mark((function e(){var _,t,a,r,c,l,o,s,u,d,E,b,m,p,h;return T.a.wrap((function(e){for(;;)switch(e.prev=e.next){case 0:_=Object(j.getSignerAddressFromPublicIdentifier)(D.a),t=[],a=Object(B.a)(D.b),e.prev=3,a.s();case 5:if((r=a.n()).done){e.next=41;break}c=r.value,console.log("network: ",c),l=new K.providers.JsonRpcProvider(Object(y.a)(c.chainId)),o=0,s=Object.entries(c.assets);case 10:if(!(o<s.length)){e.next=39;break}if(u=Object(S.a)(s[o],2),d=u[0],E=u[1],b=void 0,m=18,e.prev=14,E!==K.constants.AddressZero){e.next=21;break}return e.next=18,l.getBalance(_);case 18:b=e.sent,e.next=28;break;case 21:return p=new k.b(E,F.ERC20Abi,l),e.next=24,p.balanceOf(_);case 24:return b=e.sent,e.next=27,p.decimals();case 27:m=e.sent;case 28:e.next=33;break;case 30:e.prev=30,e.t0=e.catch(14),console.error("Couldn't get balance or decimals for asset ".concat(d,":").concat(E," on chain ").concat(c.chainId),e.t0);case 33:h={chain:O(c.chainId),assetName:d,balance:b?K.utils.formatUnits(b,m):"-"},console.log("table row: ",h),t.push(h);case 36:o++,e.next=10;break;case 39:e.next=5;break;case 41:e.next=46;break;case 43:e.prev=43,e.t1=e.catch(3),a.e(e.t1);case 46:return e.prev=46,a.f(),e.finish(46);case 49:n(t),i(!1);case 51:case"end":return e.stop()}}),e,null,[[3,43,46,49],[14,30]])})));return function(){return e.apply(this,arguments)}})()()}),[]),r.a.createElement(L.a,null,r.a.createElement(R.a,null,r.a.createElement(U.a,null,r.a.createElement(w.a,null,r.a.createElement(x.a,null,"Destination Chain"),r.a.createElement(x.a,{align:"right"},"Asset"),r.a.createElement(x.a,{align:"right"},"Exit Liquidity"))),r.a.createElement(W.a,null,o?r.a.createElement(w.a,null,"Loading..."):t.map((function(e,_){return r.a.createElement(w.a,{key:_},r.a.createElement(x.a,{component:"th",scope:"row"},e.chain),r.a.createElement(x.a,{align:"right"},e.assetName),r.a.createElement(x.a,{align:"right"},parseFloat(e.balance).toFixed(2).toString()))})))))},N=function(e){return r.a.createElement("div",null,r.a.createElement(d.a,{align:"center",p:"1rem",fontWeight:"thin",fontSize:"2xl",fontFamily:"sans-serif"},"Cross-Chain Vault Zap"),r.a.createElement(d.a,{align:"center",p:"1rem",fontWeight:"thin",fontSize:"xl",fontFamily:"sans-serif"},"By ",r.a.createElement("a",{href:"https://milfinance.xyz"},"Millennial Finance")),r.a.createElement(d.a,{align:"center",p:"1rem",fontWeight:"thin",fontSize:"l",fontFamily:"sans-serif"},"This will zap your DAI into the selected vault at"," ",r.a.createElement("a",{href:"https://polygon.beefy.finance/"},"Beefy Finance")),r.a.createElement(P,null))},z=function(){return r.a.createElement(u.d,null,r.a.createElement(u.b,{exact:!0,path:"/",component:N}),r.a.createElement(u.a,{to:"/"}))},q=t(751),H=t.n(q),G=t(1757),J=function(e){var _=e.children,t=!!Object(a.useContext)(s.a).account;return r.a.createElement("div",null,r.a.createElement(h,null),r.a.createElement("div",{className:H.a.container},r.a.createElement(G.a,null,t?_:r.a.createElement(A,null))))},Z=t(164),Q=t(194),Y=Object(Z.a)(Object(Z.a)({},Q.default),{},{styles:Object(Z.a)(Object(Z.a)({},Q.default.styles),{},{global:{body:{bg:"linear-gradient(118.5deg, #F2F3FB 13.9%, #F2F3FB 94.36%)",bgImage:"url('https://storage.googleapis.com/1hive/xpollinate/bg-pattern.svg')",backgroundRepeat:"no-repeat",backgroundAttachment:"fixed",backgroundPosition:"center",backgroundSize:"cover"}}}),colors:Object(Z.a)({},Q.default.colors),fonts:Object(Z.a)(Object(Z.a)({},Q.default.fonts),{},{body:"Manrope, sans-serif"})}),X=function(){return r.a.createElement(l.a,{theme:Y},r.a.createElement(o.a,null),r.a.createElement(s.b,null,r.a.createElement(i.a,null,r.a.createElement(J,null,r.a.createElement(z,null)))))};c.a.render(r.a.createElement(X,null),document.getElementById("root"))},279:function(module,__webpack_exports__,__webpack_require__){"use strict";__webpack_require__.d(__webpack_exports__,"a",(function(){return CONNEXT_ROUTER})),__webpack_require__.d(__webpack_exports__,"b",(function(){return NETWORKS}));var _home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_regenerator__WEBPACK_IMPORTED_MODULE_0__=__webpack_require__(3),_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_regenerator__WEBPACK_IMPORTED_MODULE_0___default=__webpack_require__.n(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_regenerator__WEBPACK_IMPORTED_MODULE_0__),_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_asyncToGenerator__WEBPACK_IMPORTED_MODULE_1__=__webpack_require__(162),_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__=__webpack_require__(24),react__WEBPACK_IMPORTED_MODULE_3__=__webpack_require__(7),react__WEBPACK_IMPORTED_MODULE_3___default=__webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_3__),axios__WEBPACK_IMPORTED_MODULE_4__=__webpack_require__(119),axios__WEBPACK_IMPORTED_MODULE_4___default=__webpack_require__.n(axios__WEBPACK_IMPORTED_MODULE_4__),ethers__WEBPACK_IMPORTED_MODULE_5__=__webpack_require__(143),contexts_Web3Context__WEBPACK_IMPORTED_MODULE_6__=__webpack_require__(131),millenial_modal__WEBPACK_IMPORTED_MODULE_7__=__webpack_require__(742),millenial_modal__WEBPACK_IMPORTED_MODULE_7___default=__webpack_require__.n(millenial_modal__WEBPACK_IMPORTED_MODULE_7__),_chakra_ui_icons__WEBPACK_IMPORTED_MODULE_8__=__webpack_require__(1702),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__=__webpack_require__(111),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_10__=__webpack_require__(365),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_11__=__webpack_require__(756),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_12__=__webpack_require__(1699),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_13__=__webpack_require__(1696),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_14__=__webpack_require__(466),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_15__=__webpack_require__(1700),_chakra_ui_react__WEBPACK_IMPORTED_MODULE_16__=__webpack_require__(464),lib_rpc__WEBPACK_IMPORTED_MODULE_17__=__webpack_require__(138),CONNEXT_ROUTER="vector52rjrwRFUkaJai2J4TrngZ6doTUXGZhizHmrZ6J15xVv4YFgFC",NETWORKS=[{assetId:"0x8f3Cf7ad23Cd3CaDbD9735AFf958023239c6A063",chainName:"Matic Mainnet",chainId:137,receiving_enabled:!0,vaults_url:{beefy:"https://raw.githubusercontent.com/beefyfinance/beefy-app/prod/src/features/configure/vault/polygon_pools.js"},zappers:{MilFinV1:"0xdcD09FF305f93510a42566f8b06DC543eaA7fdFf"},helpers:{LPvaultHelper:"0x6446E815aA6bF40a1b3a05DFaC2D573B6E2c9174",SSvaultHelper:"0x96B84adb9f337db5541D83f514B26F73Efb0457e"},vaults:[{name:"Beefy Finance mOCEAN/MATIC Q-LP Vault",token:"0x5a94F81D25c73eDdBDD84b84E8F6D36C58270510",address:"0x82303a4b2c821204A84AB2a068eC8EDf3Bc23061",router:"QUICK"},{name:"Beefy Finance wETH/wBTC Q-LP Vault",address:"0xf26607237355D7c6183ea66EC908729E9c6eEB6b",token:"0xdC9232E2Df177d7a12FdFf6EcBAb114E2231198D",router:"QUICK"}],enabled_router:"QUICK",routers:{QUICK:"0xa5E0829CaCEd8fFDD4De3c43696c57F7D7A678ff"},assets:{DAI:"0x8f3Cf7ad23Cd3CaDbD9735AFf958023239c6A063",USDC:"0x2791Bca1f2de4661ED88A30C99A7a9449Aa84174",USDT:"0xc2132D05D31c914a87C6611C10748AEb04B58e8F"}},{assetId:"0x1AF3F329e8BE154074D8769D1FFa4eE058B1DBc3",chainName:"Fantom Mainnet",chainId:250,receiving_enabled:!0,vaults_url:{beefy:"https://raw.githubusercontent.com/beefyfinance/beefy-app/prod/src/features/configure/vault/fantom_pools.js"},enabled_router:"SPOOKY",routers:{SPOOKY:"0xf491e7b69e4244ad4002bc14e878a34207e38c29"},assets:{DAI:"0x8d11ec38a3eb5e956b052f67da8bdc9bef8abf3e",USDC:"0x04068da6c83afcfa0e13ba15a6696662335d5b75",USDT:"0x049d68029688eabf473097a2fc38ef61633a3c7a"},zappers:{MilFinV1:"0x743107Cd17EDb00f94b75A770787E15FEBe5ED39"},helpers:{LPvaultHelper:"0xeaeC778E8aeE458B210315Ad2049bc4092FdC5C6",SSvaultHelper:"0xCD7433C08690AFe405e880Ad7b59583eBF1a08d1"},vaults:[{name:"LINK/FTM Beefy Finance Vault",address:"0x711969A90C9EDD815A5C2b441FC80d067EC5E969",router:"SPOOKY",isLP:!0,token:"0x89d9bc2f2d091cfbfc31e333d6dc555ddbc2fd29"},{name:"CRV/FTM Beefy Finance Vault",address:"0xdf68Bf80D427A5827Ff2c06A9c70D407e17DC041",router:"SPOOKY",isLP:!0,token:"0xb471ac6ef617e952b84c6a9ff5de65a9da96c93b"},{name:"AAVE/FTM Beefy Finance Vault",token:"0xebf374bb21d83cf010cc7363918776adf6ff2bf6",router:"SPOOKY",isLP:!0,address:"0xDa4bb93Bac7CC00F6c6e2193d115Cf45099b31a0"}]},{assetId:"0x1AF3F329e8BE154074D8769D1FFa4eE058B1DBc3",chainName:"Binance Smart Chain Mainnet",chainId:56,receiving_enabled:!1,zappers:{MilFinV1:"0x836a248c147b52A1E2BC63fb44BC129b29250811"},routers:{PANCAKE:"0x10ED43C718714eb63d5aA57B78B54704E256024E"},enabled_router:"PANCAKE",helpers:{LPvaultHelper:"0xBB9f780433c0292FBf249Aa1997B2225Ac831311",SSvaultHelper:"0xbAD29821F04533E970Ec3F828642210feAEfaF79"},vaults_url:{beefy:"https://raw.githubusercontent.com/beefyfinance/beefy-app/prod/src/features/configure/vault/bsc_pools.js"},assets:{DAI:"0x1AF3F329e8BE154074D8769D1FFa4eE058B1DBc3",USDC:"0x8AC76a51cc950d9822D68b83fE1Ad97B32Cd580d",USDT:"0x55d398326f99059fF775485246999027B3197955"}}],ASSETS=["DAI","USDC"],Modal=function Modal(_ref){var disabled=_ref.disabled,_useContext=Object(react__WEBPACK_IMPORTED_MODULE_3__.useContext)(contexts_Web3Context__WEBPACK_IMPORTED_MODULE_6__.a),web3Provider=_useContext.web3Provider,account=_useContext.account,_useState=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!1),_useState2=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState,2),showModal=_useState2[0],setShowModal=_useState2[1],_useState3=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!1),_useState4=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState3,2),withdrawalAddress=_useState4[0],setWithdrawalAddress=_useState4[1],_useState5=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(account),_useState6=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState5,2),recipient=_useState6[0],setRecipient=_useState6[1],_useState7=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!1),_useState8=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState7,2),callData=_useState8[0],setCallData=_useState8[1],_useState9=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(void 0),_useState10=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState9,2),helperText=_useState10[0],setHelperText=_useState10[1],_useState11=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!1),_useState12=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState11,2),senderOpen=_useState12[0],setSenderOpen=_useState12[1],_useState13=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!1),_useState14=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState13,2),receiverOpen=_useState14[0],setReceiverOpen=_useState14[1],_useState15=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!1),_useState16=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState15,2),vaultSelectorOpen=_useState16[0],setVaultSelectorOpen=_useState16[1],_useState17=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!1),_useState18=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState17,2),assetOpen=_useState18[0],setAssetOpen=_useState18[1],_useState19=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(ASSETS[0]),_useState20=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState19,2),asset=_useState20[0],setAsset=_useState20[1],_useState21=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(NETWORKS[0]),_useState22=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState21,2),senderChain=_useState22[0],setSenderChain=_useState22[1],_useState23=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(NETWORKS[1]),_useState24=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState23,2),receiverChain=_useState24[0],setReceiverChain=_useState24[1],_useState25=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(!disabled),_useState26=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState25,2),showButton=_useState26[0],setShowButton=_useState26[1],_useState27=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(NETWORKS[1].vaults[0]),_useState28=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState27,2),vault=_useState28[0],setVault=_useState28[1],_useState29=Object(react__WEBPACK_IMPORTED_MODULE_3__.useState)(receiverChain.vaults),_useState30=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_useState29,2),beefyVaults=_useState30[0],setBeefyVaults=_useState30[1];Object(react__WEBPACK_IMPORTED_MODULE_3__.useEffect)((function(){receiverChain.vaults&&(setVault(receiverChain.vaults[0]),setWithdrawalAddress(receiverChain.vaults[0].isLP?receiverChain.helpers.LPvaultHelper:receiverChain.helpers.SSvaultHelper))}),[receiverChain]);var isValidAddress=function(e){return!!e.match(/0x[0-9a-fA-F]{40}/)};Object(react__WEBPACK_IMPORTED_MODULE_3__.useEffect)((function(){if(receiverChain.vaults_url){var getVaults=function(){var _ref2=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_asyncToGenerator__WEBPACK_IMPORTED_MODULE_1__.a)(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_regenerator__WEBPACK_IMPORTED_MODULE_0___default.a.mark((function _callee(endPoint){var response,data,vaults,allVaults,selectedVaults,formattedVaults;return _home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_regenerator__WEBPACK_IMPORTED_MODULE_0___default.a.wrap((function _callee$(_context){for(;;)switch(_context.prev=_context.next){case 0:return _context.prev=0,_context.next=3,axios__WEBPACK_IMPORTED_MODULE_4___default.a.get(endPoint.beefy);case 3:response=_context.sent,data=response.data,vaults="["+data.substring(data.indexOf("\n")+1),allVaults=eval(vaults),selectedVaults=allVaults.filter((function(e){var _,t,a,r;return!e.depositsPaused&&"active"===e.status&&((null===(_=e.name)||void 0===_?void 0:_.includes("LP"))&&(null===(t=e.addLiquidityUrl)||void 0===t?void 0:t.includes(receiverChain.enabled_router.toLowerCase()))||((null===(a=e.name)||void 0===a?void 0:a.match(/\//g))||[]).length<2&&!(null===(r=e.name)||void 0===r?void 0:r.includes("LP")))})),formattedVaults=selectedVaults.map((function(e){var _;return{name:"Beefy ".concat(e.name," Vault"),token:e.tokenAddress,isLP:null===(_=e.name)||void 0===_?void 0:_.includes("LP"),router:receiverChain.enabled_router,address:e.earnContractAddress}})).sort((function(e,_){return e.name>_.name?1:e.name<_.name?-1:0})),setBeefyVaults(formattedVaults),setVault(formattedVaults[0]),setWithdrawalAddress(formattedVaults[0].isLP?receiverChain.helpers.LPvaultHelper:receiverChain.helpers.SSvaultHelper),_context.next=17;break;case 14:_context.prev=14,_context.t0=_context.catch(0),console.error(_context.t0);case 17:case"end":return _context.stop()}}),_callee,null,[[0,14]])})));return function(e){return _ref2.apply(this,arguments)}}();getVaults(receiverChain.vaults_url)}}),[receiverChain]),Object(react__WEBPACK_IMPORTED_MODULE_3__.useEffect)((function(){setWithdrawalAddress(vault.isLP?receiverChain.helpers.LPvaultHelper:receiverChain.helpers.SSvaultHelper)}),[vault,receiverChain]),Object(react__WEBPACK_IMPORTED_MODULE_3__.useEffect)((function(){if(receiverChain.zappers&&receiverChain.vaults&&receiverChain.routers&&receiverChain.routers[vault.router]){var e=receiverChain.zappers.MilFinV1,_=receiverChain.assets[asset],t=receiverChain.routers[vault.router];console.log("Zapper: ",e),console.log("From token: ",_),console.log("Router: ",t),console.log("Vault: ",vault);var a=new ethers__WEBPACK_IMPORTED_MODULE_5__.utils.AbiCoder,r=[e,_,vault.token,t,vault.address,recipient];console.log("Vals: ",r);var n=a.encode(["address","address","address","address","address","address"],r);console.log("Calldata: ",n),setCallData(n)}}),[recipient,account,asset,receiverChain,vault]);var handleChange=function(e){var _=e.target.value.split("-secret"),t=Object(_home_z80tr_Dev_xpollinate_node_modules_babel_preset_react_app_node_modules_babel_runtime_helpers_esm_slicedToArray__WEBPACK_IMPORTED_MODULE_2__.a)(_,2),a=t[0],r=t[1];if(!isValidAddress(a.trim()))return setHelperText("Must be an Ethereum address"),void setShowButton(!1);setHelperText(void 0),setShowButton(!disabled||void 0!==r),setRecipient(a.trim())},handleSubmit=function(e){var _={receiverAddress:""};return e.receiverAddress||(_.receiverAddress="Required"),_},swapChains=function(){var e=senderChain;setSenderChain(receiverChain),setReceiverChain(e)};return react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(react__WEBPACK_IMPORTED_MODULE_3___default.a.Fragment,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement("form",{onSubmit:handleSubmit,noValidate:!0},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.a,{templateColumns:"repeat(5, 1fr)",gap:4},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.b,{colSpan:2},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_10__.a,{id:"sender-chain",open:senderOpen,onClose:function(){return setSenderOpen(!1)},onOpen:function(){return setSenderOpen(!0)},onChange:function(e){return setSenderChain(NETWORKS[e.target.value])},fullWidth:!0,value:NETWORKS.findIndex((function(e){return e.chainId===senderChain.chainId})),borderColor:"gray.300"},NETWORKS.map((function(e,_){return react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement("option",{value:_,key:_},e.chainName," - ",e.assetName)})))),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_11__.a,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_12__.a,{icon:react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_13__.b,{size:"2rem",bg:"gray.100"},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_icons__WEBPACK_IMPORTED_MODULE_8__.a,null)),variant:"ghost",_hover:{bg:"white"},transform:"rotate(90deg)",onClick:swapChains})),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.b,{colStart:4,colEnd:6},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_10__.a,{id:"receiver-chain",open:receiverOpen,onClose:function(){return setReceiverOpen(!1)},onOpen:function(){return setReceiverOpen(!0)},onChange:function(e){return setReceiverChain(NETWORKS[e.target.value])},fullWidth:!0,value:NETWORKS.findIndex((function(e){return e.chainId===receiverChain.chainId})),borderColor:"gray.300"},NETWORKS.filter((function(e){return e.receiving_enabled})).map((function(e,_){return react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement("option",{value:_,key:_},e.chainName," - ",e.assetName)}))))),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_11__.a,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_10__.a,{id:"asset",open:assetOpen,onClose:function(){return setAssetOpen(!1)},onOpen:function(){return setAssetOpen(!0)},onChange:function(e){return setAsset(ASSETS[e.target.value])},fullWidth:!0,defaultValue:1,value:ASSETS.findIndex((function(e){return e===asset})),borderColor:"gray.300",maxW:"8rem",marginTop:"1rem"},ASSETS.map((function(e,_){return react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement("option",{value:_,key:_},e)})))),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.a,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.b,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.b,{colStart:4,colEnd:6},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_14__.a,{mb:"8px",fontWeight:"light",marginTop:"1rem",color:"#6E7191"},"Destination Vault"),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_10__.a,{id:"selected-vault",open:vaultSelectorOpen,onClose:function(){return setVaultSelectorOpen(!1)},onOpen:function(){return setVaultSelectorOpen(!0)},onChange:function(e){return setVault(beefyVaults[e.target.value])},fullWidth:!0,value:beefyVaults.findIndex((function(e){return e.address===vault.address})),borderColor:"gray.300"},beefyVaults.filter((function(e){return!e.name.includes("DAI/USDC/USDT")})).map((function(e,_){return react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement("option",{value:_,key:_},e.name," - ",e.address)})))))),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.a,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.b,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_14__.a,{mb:"8px",fontWeight:"light",marginTop:"1rem",color:"#6E7191"},"Receiver Address*"),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_15__.a,{label:"Receiver Address",name:"receiverAddress","aria-describedby":"receiverAddress",defaultValue:recipient,onChange:handleChange,borderColor:"gray.300",required:!0,fullWidth:!0})))),helperText&&react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.a,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.b,null,react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_14__.a,{id:"helper-text",color:"crimson",isTruncated:!0},helperText))),react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.a,{container:!0,spacing:2,style:{justifyContent:"center"}},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_9__.a,{item:!0,style:{marginTop:24}},react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(_chakra_ui_react__WEBPACK_IMPORTED_MODULE_16__.a,{isDisabled:!recipient||!senderChain||!receiverChain||!callData||senderChain.chainId===receiverChain.chainId,bgGradient:"linear-gradient(257.5deg, #EB0055 -39.73%, #FFFA80 107.97%)",_focus:{boxShadow:"outline"},_hover:{bg:"linear-gradient(257.5deg, #EB0055 -39.73%, #FFFA80 107.97%)"},fontWeight:"light",disabled:!withdrawalAddress||!senderChain||!receiverChain||!showButton||senderChain.chainId===receiverChain.chainId,onClick:function(){console.log("senderChain: ",senderChain),console.log("receiverChain: ",receiverChain),console.log("getRpcUrl(senderChain.chainId): ",Object(lib_rpc__WEBPACK_IMPORTED_MODULE_17__.a)(senderChain.chainId)),console.log("getRpcUrl(receiverChain.chainId): ",Object(lib_rpc__WEBPACK_IMPORTED_MODULE_17__.a)(receiverChain.chainId)),setShowModal(!0)}},disabled?"Disabled due to Maintenance":"SWAP"))),"undefined"!==web3Provider?react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement(millenial_modal__WEBPACK_IMPORTED_MODULE_7__.ConnextModal,{showModal:showModal,routerPublicIdentifier:CONNEXT_ROUTER,depositAssetId:senderChain.assets[asset],depositChainId:senderChain.chainId,withdrawAssetId:receiverChain.assets[asset],withdrawChainId:receiverChain.chainId,withdrawalAddress:withdrawalAddress,withdrawalRecipient:recipient,vaultName:vault.name,withdrawCallTo:withdrawalAddress,withdrawCallData:callData,onClose:function(){return setShowModal(!1)},depositChainProvider:Object(lib_rpc__WEBPACK_IMPORTED_MODULE_17__.a)(senderChain.chainId),withdrawChainProvider:Object(lib_rpc__WEBPACK_IMPORTED_MODULE_17__.a)(receiverChain.chainId),injectedProvider:web3Provider,loginProvider:window.ethereum}):react__WEBPACK_IMPORTED_MODULE_3___default.a.createElement("h1",null,"Loading..."))};__webpack_exports__.c=Modal},751:function(e,_,t){e.exports={container:"Home_container__3JNw6",header:"Home_header__2z2vf",main:"Home_main__2L4cf",footer:"Home_footer__3eZco",title:"Home_title__2jL4m",description:"Home_description__1txge",code:"Home_code__2jeOn",grid:"Home_grid__2WglI",card:"Home_card__2ucD6",logo:"Home_logo__3etHn"}},767:function(e,_,t){e.exports=t(1676)},785:function(e,_){},833:function(e,_){},835:function(e,_){},844:function(e,_){},846:function(e,_){},872:function(e,_){},873:function(e,_){},878:function(e,_){},880:function(e,_){},887:function(e,_){},899:function(e,_){}},[[767,1,2]]]);
//# sourceMappingURL=main.7039c09e.chunk.js.map