(ns milfin.grim)

(def vaults
  [{:NAME "Spirit",
  :ROUTER
  "0x16327E3FbDaCA3bcF7E38F5Af2599D2DDc33aE52",
  :MASTERCHEF
  "0x9083EA3756BDE6Ee6f27a6e996806FBD37F6F093",
  :EARNING_TOKEN
  "0x5cc61a78f164885776aa610fb0fe1257df78e59b",
  :vaults
  [{:lpname "SPIRIT",
    :lpaddress
    "0x5cc61a78f164885776aa610fb0fe1257df78e59b",
    :POOL_ID 0,
    :isAdded true,
    :isToken true,
    :vault
    "0x0d5Ecb27D1574E3B574d6D8c93C628d17348c99B",
    :strategy
    "0xd87b5B7004Ee92af14960669445B58644E3F676b"}]}
 {:NAME "Spooky",
  :ROUTER
  "0xF491e7B69E4244ad4002BC14e878a34207E38c29",
  :MASTERCHEF
  "0xACACa07e398d4946AD12232F40f255230e73Ca72",
  :EARNING_TOKEN
  "0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE",
  :vaults
  [{:lpname "BOO",
    :lpaddress
    "0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE",
    :POOL_ID 0,
    :isAdded true,
    :isToken true,
    :vault
    "0x177Bd708eB4880d2f0e0E319F48BF1308CFe6494",
    :strategy
    "0x6f91d4e51C160d7D8c81eD3D8B169D9D300F59cf"}]}
 {:NAME "Spirit",
  :ROUTER
  "0x16327E3FbDaCA3bcF7E38F5Af2599D2DDc33aE52",
  :MASTERCHEF
  "0x9083EA3756BDE6Ee6f27a6e996806FBD37F6F093",
  :EARNING_TOKEN
  "0x5cc61a78f164885776aa610fb0fe1257df78e59b",
  :vaults
  [{:lpname "BUSD-FUSDT",
    :lpaddress
    "0x1Ac51904cFAaD15679B3500F0fC41D2971657f80",
    :POOL_ID 27,
    :isAdded true,
    :vault
    "0xB45c9a2627219Db00D82b4F2816D544f41bCBC4B",
    :strategy
    "0x88E6d06d1752fdb74501518715e02d2F3A92F6ee"}
   {:lpname "FRAX-FTM",
    :lpaddress
    "0x0eC0E1629E776272FA3E55548D4A656BE0EEdcF4",
    :POOL_ID 14,
    :isAdded true,
    :vault
    "0x8C2DCB72c80a4e4014D0EAda094a4DD690c6fe37",
    :strategy
    "0x12276349c5Fe6cf1f0D39506a79f6cAb139Af53A"}
   {:lpname "FXS-FRAX",
    :lpaddress
    "0x100FcF27C87D1cc7b8D6c28b69b84A359e4fd377",
    :POOL_ID 16,
    :isAdded true,
    :vault
    "0x72dC5eF4EC32582b18465eD7900Fe0280Fde9736",
    :strategy
    "0x02310132f8B97e430ff7f802f45084A5Fb24F28B"}
   {:lpname "ICE-FTM",
    :lpaddress
    "0x936D23C83c2469f6a14B9f5bEaec13879598A5aC",
    :POOL_ID 7,
    :isAdded true,
    :vault
    "0x3A5A2a671d30b09ecFB95bC398be62313569b6de",
    :strategy
    "0x05105A1aC8e89D5c40255FB7AE41f3dD42C7eFb5"}
   {:lpname "YFI-WOOFY",
    :lpaddress
    "0x287ebF376c59a037B8D8E0e987461b2fd8550D8c",
    :POOL_ID 23,
    :isAdded true,
    :vault
    "0x8f9d07bae2A31b5B82F7E5fb8916296EEB3e3e9a",
    :strategy
    "0x320FC753867A919d840A23C4ee71161BcE1A8a55"}
   {:lpname "SUPRA-FTM",
    :lpaddress
    "0xa636bf8D0741b71aC8E71Ee8d83e5312fEbe7083",
    :POOL_ID 24,
    :isAdded true,
    :vault
    "0x14409cab075DDe7A50fF14e9f76c9E1B26d030AE",
    :strategy
    "0x2b43D4161Bfb2f155891EB310aF2d4a9dDaE24Db"}
   {:lpname "MM-FTM",
    :lpaddress
    "0x971D049B7BDE4ca9192A461708eBB54C8EBC0843",
    :POOL_ID 26,
    :isAdded true,
    :vault
    "0x05C8e2230bdbEdd27016F0F50eadA181D36e16B7",
    :strategy
    "0xCF5110da4894ae8626d54a37153AbfDcD3914da4"}
   {:lpname "SPIRIT-FTM",
    :lpaddress
    "0x30748322B6E34545DBe0788C421886AEB5297789",
    :POOL_ID 1,
    :isAdded true,
    :vault
    "0x6fF9e23BdC45a165f88F723A265d412F403270A0",
    :strategy
    "0x97D25Ba4220786E983C90FF3E06fC70aB937A8b2"}
   {:lpname "FTM-USDC",
    :lpaddress
    "0xe7E90f5a767406efF87Fdad7EB07ef407922EC1D",
    :POOL_ID 4,
    :isAdded true,
    :vault
    "0x0092739FEDaC3c77EdC88A1e9B83686f21b9BE96",
    :strategy
    "0x54A1A562777a4dD7aF3E5cc6de6ABA52BF2D5ddc"}
   {:lpname "DAI-SPIRIT",
    :lpaddress
    "0xfFbfc0446cA725b21256461e214E9D472f9be390",
    :POOL_ID 25,
    :isAdded true,
    :vault
    "0xd0CA2E5A8c12F56a130A7d609DcAC0f820743056",
    :strategy
    "0x5cee89aDE2Fa178856B41F140bB408142d207953"}
   {:lpname "WBTC-FTM",
    :lpaddress
    "0x279b2c897737a50405ED2091694F225D83F2D3bA",
    :POOL_ID 2,
    :isAdded true,
    :vault
    "0xD671f21fAaAd44CC5c5937Ca1e90380d3276FDf5",
    :strategy
    "0xe79Ed2A15d18cc5d484Eb096b491162C3aa13C2E"}
   {:lpname "WETH-FTM",
    :lpaddress
    "0x613BF4E46b4817015c01c6Bb31C7ae9edAadc26e",
    :POOL_ID 3,
    :isAdded true,
    :vault
    "0x106A8d32D4CcC8fA3BCf6BA39dC999853B5F4C2E",
    :strategy
    "0xc4E478a2e3a8e003C3C87895b9aa8BbaA71BeFfe"}
   {:lpname "SUSHI-FTM",
    :lpaddress
    "0x9Fe4c0CE5F533e96C2b72d852f190961AD5a7bB3",
    :POOL_ID 8,
    :isAdded true,
    :vault
    "0xBBDfebA68D7615159F1663FcF324a96F524E197F",
    :strategy
    "0x3FE26Bf782Bc672F6e660CB00668feb5306d7078"}
   {:lpname "CREAM-FTM",
    :lpaddress
    "0x040dd0d0f5e2a01fEb0C5457AbB588B23Cf4c43a",
    :POOL_ID 9,
    :isAdded true,
    :vault
    "0x724f06Dd82646b2cE819058F2F77138d42dB47Ec",
    :strategy
    "0x0DB4199F49CB97B61A8ed55B14443797B85664B1"}
   {:lpname "COVER-FTM",
    :lpaddress
    "0x5427E7AB61145c41b1e58453121245dAEF3929C3",
    :POOL_ID 12,
    :isAdded true,
    :vault
    "0x22ba9BD1D288f468F540a35017537ce9023B1aaD",
    :strategy
    "0x68d728b2f851343E906dB4b3c33E221fae11c0a2"}
   {:lpname "YFI-FTM",
    :lpaddress
    "0x4fc38a2735C7da1d71ccAbf6DeC235a7DA4Ec52C",
    :POOL_ID 13,
    :isAdded true,
    :vault
    "0x3621AE77Df07b6e341710F24083B8398a59E7eF1",
    :strategy
    "0x9E7cCBE3E29903E42fD5BAd4276E4036DcC1C529"}
   {:lpname "ANY-FTM",
    :lpaddress
    "0x26D583028989378Cc1b7CBC023f4Ae049d5e5899",
    :POOL_ID 18,
    :isAdded true,
    :vault
    "0xebf1060892c7128e0169abE52eB53D33E131880e",
    :strategy
    "0xa18404A44ac209a609C06A07Ab6e3aF92F34B268"}
   {:lpname "BNB-FTM",
    :lpaddress
    "0x74fE5Ddc4c27F91a1898ccd5Ac62dFeb2d3dF726",
    :POOL_ID 21,
    :isAdded true,
    :vault
    "0xD60ebdc6556FeCb9100C7E0c2BCCC9d18B9852D3",
    :strategy
    "0x772812B9411846ab436A6C30815C7A0c435438dd"}
   {:lpname "LINK-FTM",
    :lpaddress
    "0xd061c6586670792331E14a80f3b3Bb267189C681",
    :POOL_ID 11,
    :isAdded true,
    :vault
    "0x064bD3eBE8b5E7D4C7828fDb04b3425bBE5046c4",
    :strategy
    "0xDFad09cC21cA3f935fF6a4d79a1cd5e8F3BCc315"}
   {:lpname "CRV-FTM",
    :lpaddress
    "0x374C8ACb146407Ef0AE8F82BaAFcF8f4EC1708CF",
    :POOL_ID 10,
    :isAdded true,
    :vault
    "0xa75152568b584271486D54F606BDc2b7fA4e1f0E",
    :strategy
    "0x44AD9254cB7CE366Cc9633EaCf9723601Ede2768"}
   {:lpname "FUSDT-FTM",
    :lpaddress
    "0xd14Dd3c56D9bc306322d4cEa0E1C49e9dDf045D4",
    :POOL_ID 17,
    :isAdded true,
    :vault
    "0x19429C692737EE8a85432c8CF6209ca6d51E39c4",
    :strategy
    "0x02c97d687852b658BBE63fd2Cb8aebCd965BaACd"}
   {:lpname "CZTEARS-SPIRIT",
    :lpaddress
    "0xC66c0F0318e2777A53F884C8874B6CA3c2ED8f84",
    :POOL_ID 20,
    :isAdded true,
    :vault
    "0x0122Ce265e2F7B1E641233fd0Fd03B721B4fDa62",
    :strategy
    "0x444b72Db835199022778c868E71F77eA5C190400"}
   {:lpname "BITB-SPIRIT",
    :lpaddress
    "0xa7d46F64875a82461058806B784AfB8F33c7Ea7C",
    :POOL_ID 19,
    :isAdded true,
    :vault
    "0x210D17Fa5b223776961Dde5617A0CC99893Ed725",
    :strategy
    "0xb77aCF417ccF4313Fa998aDe93b2310053C36868"}
   {:lpname "BNB-SPIRIT",
    :lpaddress
    "0x9D103Bc85A33B007B58bE2fDee3e1A64651f676d",
    :POOL_ID 22,
    :isAdded true,
    :vault
    "0xac803ecC4F119f7fe3Af53408c30d84342d49be2",
    :strategy
    "0x5F9B26154cFd042b348a072c5B8B1CE5A3ffcB01"}
   {:lpname "USDC-GTON",
    :lpaddress
    "0x8a5555c4996B72E5725Cf108Ad773Ce5E715DED4",
    :POOL_ID 28,
    :isAdded true,
    :vault
    "0xb64d101172600FF652B669A813Fee37616182023",
    :strategy
    "0x2f88c712463D8a14676293241189578A81BFD293"}
   {:lpname "ZOO-FTM",
    :lpaddress
    "0xDF18DD2631f02D930071DF7d6FF89bbc3718C62F",
    :POOL_ID 6,
    :isAdded true,
    :vault
    "0x9e8e674D41EF4aA269BAb21C7938000CEcF367D6",
    :strategy
    "0x4E1C77992eFC6E1F436e799A96c26c271774FeEc"}]}
 {:NAME "Spooky",
  :ROUTER
  "0xF491e7B69E4244ad4002BC14e878a34207E38c29",
  :MASTERCHEF
  "0x2b2929E785374c651a81A63878Ab22742656DcDd",
  :EARNING_TOKEN
  "0x841FAD6EAe12c286d1Fd18d1d525DFfA75C7EFFE",
  :vaults
  [{:lpname "FTM-ANY",
    :lpaddress
    "0x5c021D9cfaD40aaFC57786b409A9ce571de375b4",
    :POOL_ID 22,
    :isAdded true,
    :vault
    "0xF520d3D486d3378b7370efC7722B44d0D88B4a9A",
    :strategy
    "0xD4db25120e641976A0c9072E5b6Bde3dDc2289cc"}
   {:lpname "FTM-BOO",
    :lpaddress
    "0xEc7178F4C41f346b2721907F5cF7628E388A7a58",
    :POOL_ID 0,
    :isAdded true,
    :vault
    "0x2e36e51335715c4B37022C46E8Ab170BF35B2F41",
    :strategy
    "0x64a33aC4ad822E203b740E6c4d1aF24Ea620335a"}
   {:lpname "FTM-BNB",
    :lpaddress
    "0x956DE13EA0FA5b577E4097Be837BF4aC80005820",
    :POOL_ID 19,
    :isAdded true,
    :vault
    "0xC6ac0Dd798da6A7d41a7E4717C04cA1297D58b15",
    :strategy
    "0x8Cf263D41788F593Fcb8d48fE5069175727A54D8"}
   {:lpname "FTM-SUSHI",
    :lpaddress
    "0xf84e313b36e86315af7a06ff26c8b20e9eb443c3",
    :POOL_ID 10,
    :isAdded true,
    :vault
    "0xf4828601Db52156c2d5f901A65E0D70a65557f39",
    :strategy
    "0xbbb47Af85410292897ac8DED72745f3e5ECd26e6"}
   {:lpname "FTM-WOOFY",
    :lpaddress
    "0xfD0aB56B83130ce8f2b7A4f4d4532dEe495c0794",
    :POOL_ID 20,
    :isAdded true,
    :vault
    "0x650e0523636c9811dE26ca324e761639b2ACc22F",
    :strategy
    "0x42db481a5cD346f12D2772337A8D63EF8ff95AF6"}
   {:lpname "FTM-BAND",
    :lpaddress
    "0x91b39d5584e2a7dc829f696235742cc293f2e8cf",
    :POOL_ID 12,
    :isAdded true,
    :vault
    "0xD34d4F1da52196861A0bC807804DBD150D22244A",
    :strategy
    "0xa9873ad2354732A58deDD01CCD004F0daf45F9b3"}
   {:lpname "FTM-CREAM",
    :lpaddress
    "0xb77b223490e1f5951ec79a8d09db9eab2adcb934",
    :POOL_ID 13,
    :isAdded true,
    :vault
    "0x752c106344dca85b4aA061cCa3D459747b8C9d53",
    :strategy
    "0x6614d08F4aCD4fB4073C9df42c3FE74A511074D2"}
   {:lpname "CRV-FTM",
    :lpaddress
    "0xb471ac6ef617e952b84c6a9ff5de65a9da96c93b",
    :POOL_ID 14,
    :isAdded true,
    :vault
    "0xA7c827f796761427aDa4269F56b48dCb69b6897d",
    :strategy
    "0x0ed0169D8455a87A9Aa0ABC0Cb1d41B5cb4933eB"}
   {:lpname "FTM-COVER",
    :lpaddress
    "0x5dc7848bf215f1d99f2af3d2bf78fcdf238ee34b",
    :POOL_ID 15,
    :isAdded true,
    :vault
    "0x6881A44aB179A9714f2F4670605AD4E75b3d9B36",
    :strategy
    "0x0368F5a8D974cE831757cF81bd2e2987B6Ef490b"}
   {:lpname "FTM-BADGER",
    :lpaddress
    "0x1c94665fd3ecfa969feda7ed01e35522e6982022",
    :POOL_ID 16,
    :isAdded true,
    :vault
    "0xa484E9a6C10C1a8d777ae26Dc4340958d79C3FFB",
    :strategy
    "0x8f057BDDc04808E30D80c1c3324596352ce183c0"}
   {:lpname "FTM-ICE",
    :lpaddress
    "0x623ee4a7f290d11c11315994db70fb148b13021d",
    :POOL_ID 17,
    :isAdded true,
    :vault
    "0x83859901dB1D927e387C58f5E1c89D1dfdD3E032",
    :strategy
    "0x9aD8907C96369D1c2304ED4ECE280fD0478af1e6"}
   {:lpname "FUSDT-FTM",
    :lpaddress
    "0x5965e53aa80a0bcf1cd6dbdd72e6a9b2aa047410",
    :POOL_ID 1,
    :isAdded true,
    :vault
    "0xD95D30097dcE2cF32b17d23f742F3a0c02b56895",
    :strategy
    "0xA27690119880F3c636056FD88c342F50D24239Fa"}
   {:lpname "USDC-FTM",
    :lpaddress
    "0x2b4c76d0dc16be1c31d4c1dc53bf9b45987fc75c",
    :POOL_ID 2,
    :isAdded true,
    :vault
    "0xdeED1f3CDA881763315d7Be2E147Fc9BAFCd07e9",
    :strategy
    "0xBC275436FadC8301DdD36ce8b9313D194F8B4475"}
   {:lpname "FTM-DAI",
    :lpaddress
    "0xe120ffbda0d14f3bb6d6053e90e63c572a66a428",
    :POOL_ID 3,
    :isAdded true,
    :vault
    "0x7D2c2194a17A1d6Bc2f288be7fDa22607F587A22",
    :strategy
    "0x05F6Afb9c2fE16549ff71B07A458974a1aE1Db90"}
   {:lpname "FTM-BTC",
    :lpaddress
    "0xfdb9ab8b9513ad9e419cf19530fee49d412c3ee3",
    :POOL_ID 4,
    :isAdded true,
    :vault
    "0xDfA8f14ADbfF7f477E8B6e9EA9fAd3ab8594e98B",
    :strategy
    "0x6Fe7f53058FFDA72AFFBB21c046CC89FC6F309b3"}
   {:lpname "FTM-WETH",
    :lpaddress
    "0xf0702249f4d3a25cd3ded7859a165693685ab577",
    :POOL_ID 5,
    :isAdded true,
    :vault
    "0xc1426E48378AfaD5b3cD93580b4B411E60C79536",
    :strategy
    "0x2580f51f64EfAaeAc7BaE0716FcbAb8f7Fe3c189"}
   {:lpname "FTM-LINK",
    :lpaddress
    "0x89d9bc2f2d091cfbfc31e333d6dc555ddbc2fd29",
    :POOL_ID 6,
    :isAdded true,
    :vault
    "0x5197AD80800060C324e7B8306766BCfbe73b5E7f",
    :strategy
    "0x0383727d6771e5797BBb08B8a47d297E577B1504"}
   {:lpname "FTM-AAVE",
    :lpaddress
    "0xebf374bb21d83cf010cc7363918776adf6ff2bf6",
    :POOL_ID 7,
    :isAdded true,
    :vault
    "0x64c2D4de917a0e3f07600281a7a8b1e4e422B588",
    :strategy
    "0xdF413219D20CAE3f9cCC11F5662339db7e7e9B82"}
   {:lpname "FTM-SNX",
    :lpaddress
    "0x06d173628be105fe81f1c82c9979ba79ebcafcb7",
    :POOL_ID 8,
    :isAdded true,
    :vault
    "0xAcdcECc12a5e0714add4493B1369C2849232674d",
    :strategy
    "0xB1Fdb44EfFb9c3dA4c5963746A9e82b7B2A8a0d9"}
   {:lpname "FTM-BIFI",
    :lpaddress
    "0x1656728af3a14e1319F030Dc147fAbf6f627059e",
    :POOL_ID 23,
    :isAdded true,
    :vault
    "0xDF3a54f99c08f85cFcb0D4a0849736d720EACF27",
    :strategy
    "0xA6DF07d16c52aea29BCA7A7F2767bE520D4aBC09"}]}
 {:NAME "HyperJump",
  :ROUTER
  "0x53c153a0df7E050BbEFbb70eE9632061f12795fB",
  :MASTERCHEF
  "0x90Df158ff7c31aD1d81ddDb1D8ab9d0eCBCeDa20",
  :EARNING_TOKEN
  "0x0575f8738EFdA7F512e3654F277C77e80C7d2725",
  :vaults
  [{:lpname "ORI-FTM",
    :lpaddress
    "0x0433305Ae161d28eD1408D11581610339dfC9BE4",
    :POOL_ID 1,
    :isAdded true,
    :vault
    "0xaDc65e44F69e4bB0Fe8A09CFE1c49C59Ed07d022",
    :strategy
    "0x41BC0a740E353Cf60A84D30Fe8Ac4a83D92fEc74"}
   {:lpname "AURORA-FTM",
    :lpaddress
    "0x483D07BC99CdD1DF66F64aE0A769A70725C46fA4",
    :POOL_ID 2,
    :isAdded true,
    :vault
    "0xb4Ed4Ab1079a8683e9759E41FF6e60C50FB42526",
    :strategy
    "0x98C5a05F3C46fe4348b5FB189a4f7489Aa9b1CE8"}
   {:lpname "ORI-USDC",
    :lpaddress
    "0xF70a9Af9f581c2F752Acc779148712c43E58d2f0",
    :POOL_ID 8,
    :isAdded true,
    :vault
    "0xAA54cfdD1119f29881C0FBC1d506F10BC15b03ae",
    :strategy
    "0xba995072960cd80e5e448e59189eD0B5fB166beD"}
   {:lpname "USDC-FTM",
    :lpaddress
    "0x50Cc648E45B84D68405BA0707e94c507b08e593d",
    :POOL_ID 3,
    :isAdded true,
    :vault
    "0x366986561196117Ce020ecC5E6A62e595b20f90d",
    :strategy
    "0xdc6e3F339C80f670DDd02c487D3052eac253d053"}
   {:lpname "DAI-FTM",
    :lpaddress
    "0x6D898d98818e670C695E374ED77cd1753cF109Dd",
    :POOL_ID 7,
    :isAdded true,
    :vault
    "0xE8895281398122B1F447De75d35786493Ea9Dc50",
    :strategy
    "0x718B0FB7982B00E1e81D076aFC85dD4853777B8E"}
   {:lpname "ETH-FTM",
    :lpaddress
    "0xc81a9cE5Be68dF6A52F82D83398420D8A1C245c2",
    :POOL_ID 4,
    :isAdded true,
    :vault
    "0xa286d50AE31AcA88Ab8C1C0c0E495CC991f082fE",
    :strategy
    "0xB0D464bCcD06b312304Ecc69717537a394EA08Bb"}
   {:lpname "BTC-FTM",
    :lpaddress
    "0x9a2B08B7620B8c387d96f9C1DC315aFD93651F5e",
    :POOL_ID 5,
    :isAdded true,
    :vault
    "0x9aFe2842C694ae3C3b444d048356c4e42553ee22",
    :strategy
    "0x557009a6fbc49204655e92F98C51Ebd58549ed7D"}
   {:lpname "LINK-FTM",
    :lpaddress
    "0x442bEcA06141F99466d288bde60e79330eCbDf51",
    :POOL_ID 6,
    :isAdded true,
    :vault
    "0x645cA2db228902B86c9026ACf8f824EA2A94E19B",
    :strategy
    "0x30812147268A5057b604759217c10aBfc8633713"}
   {:lpname "SUSHI-FTM",
    :lpaddress
    "0xF9f979b0283031c4afA4d668626779363B5fE510",
    :POOL_ID 13,
    :isAdded true,
    :vault
    "0xAee374a0B974ce7f270c28b6008186941aeEb213",
    :strategy
    "0x76Aa8a9F1ec0185AD121100de6aD3e8eda812A91"}
   {:lpname "YFI-FTM",
    :lpaddress
    "0xbD9d4981dEd98F5Dedfd7920C3857c4d6A5eA113",
    :POOL_ID 14,
    :isAdded true,
    :vault
    "0x34a3FEb169F3718ACE8829B46c0bA7638a32A452",
    :strategy
    "0x0c9f40274Cb12c9bD369e938CC11530D506e93CF"}
   {:lpname "SNX-FTM",
    :lpaddress
    "0xF2fCd382Ee404B105bfc0086ED41F1Bd19B8952a",
    :POOL_ID 15,
    :isAdded true,
    :vault
    "0x12ff76Dbf229CC2B54F12384585a6f7Bc5481202",
    :strategy
    "0x551AE071e061Ad2bc7a7A3B28de8226D9E462614"}
   {:lpname "ETH-ORI",
    :lpaddress
    "0xb18E654Af9c3bd229aD72C9F1e8B67518CE6aF37",
    :POOL_ID 10,
    :isAdded true,
    :vault
    "0x0F2c793F77645706b57491F301D870085980e1a4",
    :strategy
    "0xe2d1B9d0e0EF4A492384C65FCCAFdDB17A7221B3"}
   {:lpname "BTC-ORI",
    :lpaddress
    "0xdDe0ACA9Dc806544f7D5D4DD308a4ee065364Cca",
    :POOL_ID 11,
    :isAdded true,
    :vault
    "0x122B48eca046F467d54A76D81c3bf874Bf2c2F2C",
    :strategy
    "0x23758973072a88c0A7C6e010D292ad22D9335b20"}
   {:lpname "LINK-ORI",
    :lpaddress
    "0x9571d8B11035657d6FcC26fbD26ABFa23Fb62ae2",
    :POOL_ID 12,
    :isAdded true,
    :vault
    "0xb87f072126C28A7834E402a1E4B7E41ac81b70b8",
    :strategy
    "0x3fDc3b38c7320B4fDe4DCd709d94284B272aeD18"}
   {:lpname "DAI-USDC",
    :lpaddress
    "0xD7Ee3fd59a2d8082B56319f858fceaD9a902C0A1",
    :POOL_ID 9,
    :isAdded true,
    :vault
    "0x71af16B836Ba3855608a910D3E45b22B27ddF8B3",
    :strategy
    "0x07ECcD70d25BD34fc66aA1D2C49056822fD965Fb"}
   {:lpname "FTM-ESWAP",
    :lpaddress
    "0x08492d0fF546B08a9Fb3bd056665cfD240B7D55c",
    :POOL_ID 21,
    :isAdded true,
    :vault
    "0xD10780626b6b3Cca8724E9d998e25E7C01b89CF0",
    :strategy
    "0x382a9e0924E2575DC3886CE7e9125b2666FAE0e9"}
   {:lpname "ORI-ESWAP",
    :lpaddress
    "0x1935776c366db172a3c4881c7548Cd35D7457c5c",
    :POOL_ID 22,
    :isAdded true,
    :vault
    "0x253641B5e9627F53072F06eD0C5f16bA629C70a1",
    :strategy
    "0xD39A2860065d2B2c09d5CFA21fA3060DDB4a712A"}]}
 {:NAME "WakaFinance",
  :ROUTER
  "0x7B17021FcB7Bc888641dC3bEdfEd3734fCaf2c87",
  :MASTERCHEF
  "0xaEF349E1736b8A4B1B243A369106293c3a0b9D09",
  :EARNING_TOKEN
  "0xf61cCdE1D4bB76CeD1dAa9D4c429cCA83022B08B",
  :vaults
  [{:lpname "WAKA-FTM",
    :lpaddress
    "0x696885e9581bd33ee9877bd8750ddda65381ff01",
    :POOL_ID 0,
    :isAdded true,
    :vault
    "0x7cC3C243CB8e2f9Ddef1e37bDc27dBa162109FE2",
    :strategy
    "0xAC03928dEeA347a2E83796C79c2317de58648853"}
   {:lpname "FTM-DAI",
    :lpaddress
    "0x78da2bd2c18837c9d1b9008c81078e378f1952c6",
    :POOL_ID 6,
    :isAdded true,
    :vault
    "0x847D8c0C0b7e5afce86dBEeaE782B178eba12D5B",
    :strategy
    "0xbD0026f3971B2DD4a3E43702F07DA64694fd8Acf"}
   {:lpname "FTM-SUSHI",
    :lpaddress
    "0x1b084cda6e11347b3c15eae537cf8a7ce39f96da",
    :POOL_ID 8,
    :isAdded true,
    :vault
    "0xAf677319f6cb43827bB1a9fE4ba74406E88984bD",
    :strategy
    "0x82a35DA99a72634aFee195E5A6e52Ffc479Ebf07"}
   {:lpname "FTM-BADGER",
    :lpaddress
    "0x8a400d6bf3cdf070af6e3312ef4f9681f16a92bd",
    :POOL_ID 10,
    :isAdded true,
    :vault
    "0xF8963c3B8705F312B8b38CdE3d8B411a4D5b6317",
    :strategy
    "0x9FBF0D797Fe8356DE4D9Cc8ec330c57E4539D642"}
   {:lpname "FTM-AAVE",
    :lpaddress
    "0x2e783ce36830a6274761cc4a9d04d275553f3bc1",
    :POOL_ID 11,
    :isAdded true,
    :vault
    "0x5d2289dA1bb9718Ffa6560FEdE8e25CB81175202",
    :strategy
    "0x1CFf1A7391085D2a4580d53F810e6FFB1B9d2412"}
   {:lpname "FTM-ICE",
    :lpaddress
    "0xef179689b6d242ffc93dfc69241f74d4d391fa7c",
    :POOL_ID 12,
    :isAdded true,
    :vault
    "0x50b3A8bCd47174b9B4F2386AF93FeC616c43C946",
    :strategy
    "0x78ed7831E13BCbcDE997751b456689FfD8aE3553"}
   {:lpname "FTM-SNX",
    :lpaddress
    "0xff09b99aed8fb58c209904f6adc4a1fcceea79ac",
    :POOL_ID 13,
    :isAdded true,
    :vault
    "0x981A93DcFF4FC1143942e342bc9BB3E67A2b8775",
    :strategy
    "0x5B2E1AE18F85b7996aa7dcdC6881D0c915baa441"}
   {:lpname "FTM-CREAM",
    :lpaddress
    "0x3c4ad49f26b47f00f7e5165b942d41367dd60a04",
    :POOL_ID 14,
    :isAdded true,
    :vault
    "0x0266e2DF6D0f6e6f2C40eB84bBC9cD2487DCA30C",
    :strategy
    "0x41773059FA089DF0f72Cc40e5D60B613B1EA4bf9"}
   {:lpname "FTM-COVER",
    :lpaddress
    "0x9c58df352fcd984700c57324a116845378adc5ba",
    :POOL_ID 15,
    :isAdded true,
    :vault
    "0x8a88A650612E0362C9e8c21139bb617DB12241D7",
    :strategy
    "0x84D2C5f060AB6A9E7eA1e394ac1f1B99c2364fdC"}
   {:lpname "FTM-LINK",
    :lpaddress
    "0x32736ae178d0debf137326a0c0c6d50e374d9f19",
    :POOL_ID 16,
    :isAdded true,
    :vault
    "0x3066bE17129857bFeEe112c14887dd8abAc2e590",
    :strategy
    "0x505770E446F13034565C7635b9872B12224C616d"}
   {:lpname "FTM-CRV",
    :lpaddress
    "0x3b1b72d6de14a45096227c3319dd58fceae95faf",
    :POOL_ID 17,
    :isAdded true,
    :vault
    "0x820345700b090DEE21EB6322484A1511423ddd83",
    :strategy
    "0x43245f2930684B739a98a230bdE998f4A5fFf87c"}
   {:lpname "FTM-BAND",
    :lpaddress
    "0x60ff8c1dffc8252cfd94c07f65feb4ce90ee9b99",
    :POOL_ID 18,
    :isAdded true,
    :vault
    "0x163b6C8A510Ba7c4487d47d3E709Af00A1a7d340",
    :strategy
    "0x996f2994170D781B493c889eb3be2cA264baDC61"}
   {:lpname "FTM-YFI",
    :lpaddress
    "0xb0e5d65b4c22ff9f099e449df03acb3a57bb5f27",
    :POOL_ID 7,
    :isAdded true,
    :vault
    "0x46982CAA0d955F3aC70Fa7CAE127e4D9Eb409CC4",
    :strategy
    "0xb6372366D587E13543ffe72435414338F27D3ce7"}
   {:lpname "FTM-WBTC",
    :lpaddress
    "0x195C45044B121D8CAF4C9e2d8F47fb81f4E12f21",
    :POOL_ID 3,
    :isAdded true,
    :vault
    "0x4574005C8DB94210bA17F7b0591c118Df0E1f6DB",
    :strategy
    "0x4F5A0B04810D0E73D42F4Ab9d7AC1FaA3EfD2256"}
   {:lpname "FTM-WETH",
    :lpaddress
    "0x0eea1bf6342c71171882c2ac3838a9c78e00b5cb",
    :POOL_ID 4,
    :isAdded true,
    :vault
    "0x334c090e07d14280Af91Bf2b3a12eCA3913DF1A8",
    :strategy
    "0xEc3e5713f262dE098A0c394A40ee4678DBD203a1"}]}
 {:NAME "Steak",
  :ROUTER
  "0x16327E3FbDaCA3bcF7E38F5Af2599D2DDc33aE52",
  :MASTERCHEF
  "0x59cC5f5F9309448Fe4a7Bd2dB8eB2DaC0F8fCEA7",
  :EARNING_TOKEN
  "0x05848B832E872d9eDd84AC5718D58f21fD9c9649",
  :vaults
  [{:lpname "STEAK-FUSD",
    :lpaddress
    "0xcA78e7c058951D1e50eE74B8e9FBb4c9523E9e5A",
    :POOL_ID 1,
    :isAdded true,
    :vault
    "0x687F1063a566371D29eb9A656d39cd669DB6c40e",
    :strategy
    "0x4a6F90d2f2FaEA5DAa7E76F18aF8d139C1182Ceb"}
   {:lpname "USDC-FUSD",
    :lpaddress
    "0x679449a920087828776aeEF4074549410D5c8065",
    :POOL_ID 2,
    :isAdded true,
    :vault
    "0x0303Ef025fdbc76c22bc7b00613AaA489EfD7CDb",
    :strategy
    "0x5F96C10c9a034F8F45197a40768a4ffcFdaDCA27"}
   {:lpname "FTM-FUSD",
    :lpaddress
    "0xBaf1B2fD16f7294ca158B3F1065e5f27F9c72b61",
    :POOL_ID 5,
    :isAdded true,
    :vault
    "0x041C84B45A16d270716257c89b91B3cabAf9aeB4",
    :strategy
    "0x42dEBAc1947aaFfbF3eB5F7dB9d94713C0765Bc4"}]}
 {:NAME "Popsicle",
  :ROUTER
  "0xF491e7B69E4244ad4002BC14e878a34207E38c29",
  :MASTERCHEF
  "0xbf513aCe2AbDc69D38eE847EFFDaa1901808c31c",
  :EARNING_TOKEN
  "0xf16e81dce15b08f326220742020379b855b87df9",
  :vaults
  [{:lpname "ICE-FTM",
    :lpaddress
    "0x623ee4a7f290d11c11315994db70fb148b13021d",
    :POOL_ID 1,
    :isAdded true,
    :vault
    "0x6D69AD57b242C2777aaC8F2E00ce1f27450E9374",
    :strategy
    "0x2d62382a36271C03F23ecf35eA41bC4E923aD90C"}]}
   ])
